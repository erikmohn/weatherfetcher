package parser;

import java.io.IOException;

import configuration.WeatherStation;

import vindsiden.Measurement;

public abstract class WeatherDataParser<WEATHERSTATION extends WeatherStation<?>> {

	private WEATHERSTATION weatherStation;
	
	public abstract Measurement fetchMeasurement() throws IOException;
	
	public WeatherDataParser initialize(WEATHERSTATION weatherStation) {
		this.weatherStation = weatherStation;
		return this;
	}

	public void setWeatherStation(WeatherStation weatherStation) {
		this.weatherStation = (WEATHERSTATION) weatherStation;
	}

	public WEATHERSTATION getWeatherStation() {
		return weatherStation;
	}
	
}
