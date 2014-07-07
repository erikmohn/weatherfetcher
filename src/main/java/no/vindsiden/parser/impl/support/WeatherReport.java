package no.vindsiden.parser.impl.support;

import java.util.ArrayList;
import java.util.List;

import no.vindsiden.parser.impl.support.holfuy.HolfuyWeatherMeasurement;

public class WeatherReport {

	private List<HolfuyWeatherMeasurement> measurements;

	public void addWeatherMeasurement(HolfuyWeatherMeasurement measurement) {
		if (measurements == null) {
			measurements = new ArrayList<HolfuyWeatherMeasurement>();
		}
		measurements.add(measurement);
	}
	
	public List<HolfuyWeatherMeasurement> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(List<HolfuyWeatherMeasurement> measurements) {
		this.measurements = measurements;
	}
	
}
