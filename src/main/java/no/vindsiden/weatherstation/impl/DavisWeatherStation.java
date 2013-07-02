package no.vindsiden.weatherstation.impl;

import no.vindsiden.parser.impl.DavisDataParser;
import no.vindsiden.weatherstation.WeatherStation;

public class DavisWeatherStation extends WeatherStation<DavisDataParser> {


	
	public DavisWeatherStation(int id, Class<DavisDataParser> clazz, String name) {
		super(id, clazz, name);
	}
}
