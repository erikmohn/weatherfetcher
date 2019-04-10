package no.vindsiden.parser.impl.support.holfuy;

import no.vindsiden.domain.Measurement;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class HolfuyMeasurementTransformer {

	public static Collection<Measurement>  transform(List<HolfuyWeatherMeasurement> measurements) {
		return measurements.stream().filter(weatherMeasurement -> {
			boolean configuredStation = true;
			try {
				HolfuyStationId.valueOf("s" + weatherMeasurement.getStation().getId());
			} catch (IllegalArgumentException e) {
				configuredStation = false;
				System.out.println("Weatherstation: " + weatherMeasurement.getStation().getId() + " not configured!");
			}

			return configuredStation;
		}).map(weatherMeasurement -> {
			Measurement measurement = new Measurement();
			measurement.setDirectionAvg(weatherMeasurement.getWind().getDir());
			measurement.setTemperature1(weatherMeasurement.getTemp().getTemp());
			measurement.setWindAvg(weatherMeasurement.getWind().getSpeed() * 0.5144);
			measurement.setWindMin(((weatherMeasurement.getWind().getSpeed() * 2) - weatherMeasurement.getWind().getGust()) * 0.5144);
			measurement.setWindMax(weatherMeasurement.getWind().getGust() * 0.5144);
			measurement.setStationID(HolfuyStationId.valueOf("s" + weatherMeasurement.getStation().getId()).getVindsidenId());
			measurement.setStationName(weatherMeasurement.getStation().getLocation());
			return measurement;
		}).collect(Collectors.toList());
	}
	
}
