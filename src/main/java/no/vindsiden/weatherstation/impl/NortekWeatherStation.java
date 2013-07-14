package no.vindsiden.weatherstation.impl;

import no.vindsiden.parser.impl.NortekDataParser;
import no.vindsiden.weatherstation.WeatherStation;

public class NortekWeatherStation extends WeatherStation<NortekDataParser> {

	public NortekWeatherStation(int id, Class<NortekDataParser> clazz, String name) {
		super(id, clazz, name);
	}

}
