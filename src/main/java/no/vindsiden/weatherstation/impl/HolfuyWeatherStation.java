package no.vindsiden.weatherstation.impl;

import no.vindsiden.weatherstation.WeatherStation;

public class HolfuyWeatherStation extends WeatherStation {

	public HolfuyWeatherStation(int id, String url, String name) {
		super(id,name);
		setUrl(url);
	}

}
