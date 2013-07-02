package no.vindsiden.configuration;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import no.vindsiden.weatherstation.WeatherStation;


import com.thoughtworks.xstream.XStream;


/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class Configuration {

	private String vindSidenUrl;
	private List<WeatherStation<?>> weatherStationList;
	private long timeToSleepBeforeErrorHandling;

	public void addWeatherStation(WeatherStation<?> weatherStation) {
		if (weatherStationList == null) {
			this.weatherStationList = new ArrayList<WeatherStation<?>>();
		}
		weatherStationList.add(weatherStation);
	}

	public List<WeatherStation<?>> getWeatherStationList() {
		return weatherStationList;
	}

	public void setVindSidenUrl(String vindSidenUrl) {
		this.vindSidenUrl = vindSidenUrl;
	}

	public String getVindSidenUrl() {
		return vindSidenUrl;
	}
	
	public static Configuration getConfiguration() {
		InputStream is = ClassLoader.getSystemResourceAsStream("configuration.xml");
		return (Configuration) new XStream().fromXML(is);		
	}

	public void setTimeToSleepBeforeErrorHandling(long timeToSleepBeforeErrorHandling) {
		this.timeToSleepBeforeErrorHandling = timeToSleepBeforeErrorHandling;
	}

	public long getTimeToSleepBeforeErrorHandling() {
		return timeToSleepBeforeErrorHandling;
	}
	
}
