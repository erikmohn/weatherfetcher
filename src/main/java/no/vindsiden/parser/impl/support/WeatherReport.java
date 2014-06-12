package no.vindsiden.parser.impl.support;

import java.util.ArrayList;
import java.util.List;

import no.vindsiden.parser.impl.support.holfuy.WeatherMeasurement;

public class WeatherReport {

	private List<WeatherMeasurement> measurements;

	public void addWeatherMeasurement(WeatherMeasurement measurement) {
		if (measurements == null) {
			measurements = new ArrayList<WeatherMeasurement>();
		}
		measurements.add(measurement);
	}
	
	public List<WeatherMeasurement> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(List<WeatherMeasurement> measurements) {
		this.measurements = measurements;
	}
	
}
