package configuration;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

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
	
	public static Configuration getConfiguration() {
		InputStream is = ClassLoader.getSystemResourceAsStream("configuration.xml");
		return (Configuration) new XStream().fromXML(is);
		
	}
	
}
