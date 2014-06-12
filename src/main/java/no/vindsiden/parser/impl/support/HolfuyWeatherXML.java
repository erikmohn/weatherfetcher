package no.vindsiden.parser.impl.support;

import java.util.ArrayList;
import java.util.List;

import no.vindsiden.parser.impl.support.holfuy.WeatherMeasurement;

public class HolfuyWeatherXML {

	private List<WeatherMeasurement> measurements;

	public HolfuyWeatherXML() {
		measurements = new ArrayList<WeatherMeasurement>();
	}

	public List<WeatherMeasurement> getMeasurements() {
		return measurements;
	}

	public void add(WeatherMeasurement measurement) {
		measurements.add(measurement);
	}

}
