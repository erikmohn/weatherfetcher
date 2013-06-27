package no.vindsiden.process;

import java.io.IOException;

import no.vindsiden.configuration.Configuration;
import no.vindsiden.vindsiden.Measurement;
import no.vindsiden.vindsiden.VindsidenHttpClient;
import no.vindsiden.weatherstation.WeatherStation;

import org.apache.commons.httpclient.HttpException;


/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class WeatherFetcher {

	private VindsidenHttpClient httpClient;
	private Configuration configuration;

	public WeatherFetcher(Configuration config) {
		this.httpClient = new VindsidenHttpClient();
		this.configuration = config;
	}

	public void execute() {
		for (WeatherStation<?> weatherStation : configuration.getWeatherStationList()) {
			try {
				processSingleWeatherStation(weatherStation);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void processSingleWeatherStation(WeatherStation<?> weatherStation) throws IOException, HttpException {
		Measurement measurement = weatherStation.fetchMeasurement();
		httpClient.sendHttpRequest(measurement);
		log("Executed HTTP request: " + measurement.toVindSidenUrl());
	}

	public void setHttpClient(VindsidenHttpClient httpClient) {
		this.httpClient = httpClient;
	}

	protected void log(String log) {
		System.out.println(log);
	}

}
