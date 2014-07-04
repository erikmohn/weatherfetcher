package no.vindsiden.parser.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;
import java.util.TimeZone;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.DavisDescription;
import no.vindsiden.parser.impl.support.WeatherDataUnavailableException;
import no.vindsiden.parser.impl.support.WindUnitType;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang.math.NumberUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.google.common.collect.Lists;

public class DavisDataParser extends WeatherDataParser {

	private String[] data;
	private Measurement measurement;

	public DavisDataParser(WeatherStation weatherStation) {
		super(weatherStation);
	}

	@Override
	public List<Measurement> fetchMeasurement() throws IOException {
		fetchDataFromWeatherStation();
		parseWeatherData();

		return Lists.newArrayList(measurement);
	}

	private void parseWeatherData() {
		if (data.length < DavisDescription.AVG_WIND_SPEED_10_MINUTES.getIndex()) {
			throw new WeatherDataUnavailableException(
					"Davis WeatherData not available");
		}

		Measurement m = new Measurement();
		m.setStationID(getWeatherStation().getWeatherStationId());
		m.setTime(new DateTime(DateTimeZone.forTimeZone(TimeZone
				.getTimeZone("Europe/Oslo"))));

		Double avgWindSpeed = getWindSpeed(Double
				.parseDouble(data[DavisDescription.AVG_WIND_SPEED_10_MINUTES
						.getIndex()]));
		Double windSpeed = getWindSpeed(Double
				.parseDouble(data[DavisDescription.AVG_WIND_SPEED.getIndex()]));
		Double maxWindSpeed = getWindSpeed(Double
				.parseDouble(data[DavisDescription.GUSTS.getIndex()]));

		m.setWindAvg(avgWindSpeed);
		m.setWindMin(NumberUtils.min(avgWindSpeed, maxWindSpeed, windSpeed));
		m.setWindMax(NumberUtils.max(avgWindSpeed, maxWindSpeed, windSpeed));

		m.setDirectionAvg(Integer.parseInt(data[DavisDescription.WIND_DIRECTION
				.getIndex()]));
		m.setTemperature1(Double.parseDouble(data[DavisDescription.TEMP
				.getIndex()]));

		m.setWindVectorAvg(-999.0);
		m.setWindStDev(0.5);
		m.setDirectionStDev(0.0);
		m.setTemperature2(-999.0);
		m.setLight(-999);
		m.setBattery(-999.0);

		measurement = m;
	}

	private Double getWindSpeed(double windSpeed) {
		double ws = windSpeed;
		if (WindUnitType.KNOTS.equals(getWeatherStation().getWindUnitType())) {
			ws = windSpeed * 0.5144;
		}
		BigDecimal wsBigDecimal = new BigDecimal(ws).setScale(1,
				BigDecimal.ROUND_UP);
		return wsBigDecimal.doubleValue();
	}

	private void fetchDataFromWeatherStation() throws IOException,
			HttpException {
		String url = getWeatherStation().getUrl();
		HttpClient httpClient = new HttpClient();
		GetMethod method = new GetMethod(url + "/clientraw.txt");

		httpClient.executeMethod(method);

		BufferedReader br = new BufferedReader(new InputStreamReader(
				method.getResponseBodyAsStream()));
		StringBuilder sb = new StringBuilder();
		String readLine;
		while (((readLine = br.readLine()) != null)) {
			sb.append(readLine);
		}

		data = new String(sb.toString()).split(" ");
		method.releaseConnection();
	}

}
