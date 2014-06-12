package no.vindsiden.weatherstation.impl;

import no.vindsiden.parser.impl.HolfuyDataParser;
import no.vindsiden.weatherstation.WeatherStation;

public class HolfuyWeatherStation extends WeatherStation<HolfuyDataParser> {

	public HolfuyWeatherStation(int id, String url, String name) {
		super(id, HolfuyDataParser.class, name);
		setUrl(url);
	}

}
