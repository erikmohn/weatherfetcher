package no.vindsiden.parser.impl.support.holfuy;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("holfuyweatherxml")
public class HolfuyWeatherXML {

	@XStreamImplicit
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
