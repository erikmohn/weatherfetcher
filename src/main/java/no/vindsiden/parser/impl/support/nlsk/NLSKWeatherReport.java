package no.vindsiden.parser.impl.support.nlsk;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("stasjoner")
public class NLSKWeatherReport {

	@XStreamImplicit
	private List<NLSKWeatherMeasurement> measurements;

	public List<NLSKWeatherMeasurement> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(List<NLSKWeatherMeasurement> measurements) {
		this.measurements = measurements;
	}
}
