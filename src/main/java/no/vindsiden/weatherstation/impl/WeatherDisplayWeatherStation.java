package no.vindsiden.weatherstation.impl;

import no.vindsiden.parser.impl.WeatherDisplayDataParser;
import no.vindsiden.weatherstation.WeatherStation;

public class WeatherDisplayWeatherStation extends WeatherStation<WeatherDisplayDataParser> {

	
	public WeatherDisplayWeatherStation(int id, Class<WeatherDisplayDataParser> clazz, String name) {
		super(id, clazz, name);
	}
}
