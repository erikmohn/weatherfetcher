package no.vindsiden.weatherstation.impl;

import no.vindsiden.weatherstation.WeatherStation;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class DavisWeatherLinkWeatherStation extends WeatherStation {
	
	public DavisWeatherLinkWeatherStation(int id, String url, String name) {
		super(id, name);
		setUrl(url);
	}
}
