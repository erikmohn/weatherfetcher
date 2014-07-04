package no.vindsiden.domain;

import java.util.Comparator;

public class WeatherStationComparator implements Comparator<WeatherStation> {

	@Override
	public int compare(WeatherStation o1, WeatherStation o2) {
		if (o1.getWeatherStationId() > o2.getWeatherStationId()) {
			return 1;
		} else if (o1.getWeatherStationId() < o2.getWeatherStationId()) {
			return -1;
		}
		return 0;
	}

}
