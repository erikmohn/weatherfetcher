package no.vindsiden.weatherstation.impl;

import no.vindsiden.parser.impl.DavisWeatherLinkDataParser;
import no.vindsiden.weatherstation.WeatherStation;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class DavisWeatherLinkWeatherStation extends WeatherStation<DavisWeatherLinkDataParser> {
	
	public DavisWeatherLinkWeatherStation(int id, String url, String name) {
		super(id, DavisWeatherLinkDataParser.class, name);
		setUrl(url);
	}
}
