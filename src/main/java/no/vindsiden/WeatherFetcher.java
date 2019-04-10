package no.vindsiden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import no.vindsiden.configuration.Configuration;
import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.domain.WeatherStationComparator;

import org.apache.commons.httpclient.HttpException;


/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class WeatherFetcher {

	private Configuration configuration;
	private VindsidenHttpClient httpClient;
	private List<WeatherStation> weatherStations;
	private List<WeatherStation> failedWeatherStations;
	private boolean inErrorHandling = false; 
	
	public WeatherFetcher(Configuration config) {
		this.configuration = config;
		this.httpClient = new VindsidenHttpClient();
		this.weatherStations = config.getWeatherStationList();
		this.failedWeatherStations = new ArrayList<WeatherStation>();
	}

	public void execute() {
		logStart();
		validate();
		processWeatherStations();
		if (failedWeatherStationsExists()) {
			log("Will do error handling of: " + failedWeatherStations);
			executeErrorHandling();			
		}	
		logFinish();
	}

	private void logStart() {
		printFrame("STARTING EXECTUION OF WEATHERFETCHER");
		
	}
	
	private void printFrame(String string) {
		log("---------------------------------------------");
		log("--- " + string);
		log("---------------------------------------------");
		
	}

	private void logFinish() {
		printFrame("EXECTUION OF WEATHERFETCHER FINISHED");	
		}

	private void validate() {
		if ( weatherStations == null || weatherStations.size() == 0) {
			throw new RuntimeException("No weatherStations configured!");
		}
	}

	private void processWeatherStations() {
		List<WeatherStation> weatherStations = (inErrorHandling) ? failedWeatherStations : this.weatherStations; 

		Collections.sort(weatherStations, new WeatherStationComparator());
		for (WeatherStation weatherStation : weatherStations) {
			try {
				if(weatherStation.isEnabled()) {
					processWeatherStation(weatherStation);					
				}
			} catch (Exception e) {
				log("Error occured while processing: " + weatherStation);
				if (!inErrorHandling) {
					failedWeatherStations.add(weatherStation);					
				}
				e.printStackTrace();
			}
		}
	}

	private void processWeatherStation(WeatherStation weatherStation) throws IOException, HttpException {
		
		List<Measurement> measurements =  weatherStation.fetchMeasurement();


		for (Measurement measurement : measurements) {
			String name = (measurements.size() == 1 ) ? weatherStation.getName() : measurement.getStationName();
            Instant latestUpdate = null;
			if (measurement.getTimestamp() != null) {
			    latestUpdate = httpClient.getLatestUpdateTimestamp(measurement);
            }

			if (latestUpdate == null || measurement.getTimestamp().isAfter(latestUpdate)) {
				httpClient.sendHttpRequest(measurement);
				log( Instant.now() + " Executed HTTP request, for " + name + " : " + measurement.toVindSidenUrl());
			} else {
				log( Instant.now() + " Did not send data, due to outdated timestamp:  " + measurement.getTimestamp() + " " + name + " : " + measurement.toVindSidenUrl());
			}
		}
	}



	private void executeErrorHandling() {
		inErrorHandling = true;
		try {
			Thread.sleep(configuration.getTimeToSleepBeforeErrorHandling());	
			processWeatherStations();
		} catch (InterruptedException e) {
			log("Thread.sleep Interrupted");
			e.printStackTrace();
		} finally {
			clearFailedWeatherStations();
		}
	}
	
	private boolean failedWeatherStationsExists() {
		return failedWeatherStations.size() != 0;
	}
	
	private void clearFailedWeatherStations() {
		failedWeatherStations.clear();
	}

	public void setHttpClient(VindsidenHttpClient httpClient) {
		this.httpClient = httpClient;
	}

	protected void log(String log) {
		System.out.println(log);
	}

}
