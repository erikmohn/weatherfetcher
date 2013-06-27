package no.vindsiden.weatherstation.impl;

import no.vindsiden.parser.impl.DavisDataParser;
import no.vindsiden.weatherstation.WeatherStation;

public class DavisWeatherStation extends WeatherStation<DavisDataParser> {

	private String davisBaseUrl;
	
	public DavisWeatherStation(int id, Class<DavisDataParser> clazz) {
		super(id, clazz);
	}

	public void setDavisBaseUrl(String davisBaseUrl) {
		this.davisBaseUrl = davisBaseUrl;
	}

	public String getDavisBaseUrl() {
		return davisBaseUrl;
	}

}
