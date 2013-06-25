package configuration;

import java.util.ArrayList;
import java.util.List;

import parser.WeatherDataParser;


public class Configuration {

	private String vindSidenUrl;
	private List<WeatherStation<WeatherDataParser<?>>> weatherStationList;

	public void addWeatherStation(WeatherStation weatherStation) {
		if (weatherStationList == null) {
			this.weatherStationList = new ArrayList<WeatherStation<WeatherDataParser<?>>>();
		}
		weatherStationList.add(weatherStation);
	}

	public List<WeatherStation<WeatherDataParser<?>>> getWeatherStationList() {
		return weatherStationList;
	}

	public void setVindSidenUrl(String vindSidenUrl) {
		this.vindSidenUrl = vindSidenUrl;
	}

	public String getVindSidenUrl() {
		return vindSidenUrl;
	}
}
