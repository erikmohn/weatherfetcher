package no.vindsiden.weatherstation.impl;

import no.vindsiden.parser.impl.DavisDataParser;
import no.vindsiden.parser.impl.support.WindUnitType;
import no.vindsiden.weatherstation.WeatherStation;

public class DavisWeatherStation extends WeatherStation<DavisDataParser> {

	private WindUnitType windUnitType;
	
	public DavisWeatherStation(int id, Class<DavisDataParser> clazz, String name) {
		super(id, clazz, name);
	}

	public void setWindUnitType(WindUnitType windUnitType) {
		this.windUnitType = windUnitType;
	}

	public WindUnitType getWindUnitType() {
		return windUnitType;
	}
}
