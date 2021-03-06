package no.vindsiden.parser.impl.support.holfuy;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("weathermeasurement")
public class HolfuyWeatherMeasurement {
	private Station station;
	private Temp temp;
	private Timestamp timestamp;
	private Wind wind;

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Temp getTemp() {
		return temp;
	}

	public void setTemp(Temp temp) {
		this.temp = temp;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}
}
