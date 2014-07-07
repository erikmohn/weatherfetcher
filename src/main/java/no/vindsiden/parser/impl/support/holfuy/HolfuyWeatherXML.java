package no.vindsiden.parser.impl.support.holfuy;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("holfuyweatherxml")
public class HolfuyWeatherXML {

	@XStreamImplicit
	private List<HolfuyWeatherMeasurement> measurements;

	public HolfuyWeatherXML() {
		measurements = new ArrayList<HolfuyWeatherMeasurement>();
	}

	public List<HolfuyWeatherMeasurement> getMeasurements() {
		return measurements;
	}

	public void add(HolfuyWeatherMeasurement measurement) {
		measurements.add(measurement);
	}

}
