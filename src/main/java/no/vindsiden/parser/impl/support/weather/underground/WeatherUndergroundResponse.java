package no.vindsiden.parser.impl.support.weather.underground;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("response")
public class WeatherUndergroundResponse {

	public CurrentObservation getCurrent_observation() {
		return current_observation;
	}

	public void setCurrent_observation(CurrentObservation current_observation) {
		this.current_observation = current_observation;
	}

	CurrentObservation current_observation;
	
}
