package no.vindsiden.parser.impl;

import java.io.IOException;
import java.util.TimeZone;

import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.DavisDescription;
import no.vindsiden.vindsiden.Measurement;
import no.vindsiden.weatherstation.WeatherStation;
import no.vindsiden.weatherstation.impl.DavisWeatherStation;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class DavisDataParser extends WeatherDataParser {

	private String[] data;
	private Measurement measurement;

	public DavisDataParser(WeatherStation<DavisDataParser> weatherStation) {
		setWeatherStation(weatherStation);
	}

	@Override
	public Measurement fetchMeasurement() throws IOException {
		fetchDataFromWeatherStation();

		parseWeatherData();
		
		return measurement;
	}

	private void parseWeatherData() {
		Measurement m = new Measurement();
		m.setStationID(getWeatherStation().getWeatherStationId());	
		m.setTime(new DateTime(DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/Oslo"))));

		Double avgWindSpeed = Double.parseDouble(data[DavisDescription.AVG_WIND_SPEED_10_MINUTES.getIndex()]); 
		Double windSpeed = Double.parseDouble(data[DavisDescription.AVG_WIND_SPEED.getIndex()]);
		Double maxWindSpeed = Double.parseDouble(data[DavisDescription.GUSTS.getIndex()]);
		
		m.setWindAvg(windSpeed < avgWindSpeed ? avgWindSpeed : windSpeed);
		m.setWindMin(windSpeed > avgWindSpeed ? avgWindSpeed : windSpeed);
		m.setWindMax(avgWindSpeed > maxWindSpeed ? avgWindSpeed : maxWindSpeed);
		
		m.setDirectionAvg(Integer.parseInt(data[DavisDescription.WIND_DIRECTION.getIndex()]));
		m.setTemperature1(Double.parseDouble(data[DavisDescription.TEMP.getIndex()]));

		m.setWindVectorAvg(-999.0);
		m.setWindStDev(0.5);
		m.setDirectionStDev(0.0);
		m.setTemperature2(-999.0);
		m.setLight(-999);
		m.setBattery(-999.0);
		
		measurement = m;
	}

	private void fetchDataFromWeatherStation() throws IOException, HttpException {
		String url = ((DavisWeatherStation) getWeatherStation()).getDavisBaseUrl();
		HttpClient httpClient = new HttpClient();
		GetMethod method = new GetMethod(url + "/clientraw.txt");

		httpClient.executeMethod(method);
		byte[] result = method.getResponseBody();
		data = new String(result).split(" ");
		method.releaseConnection();
	}

}
