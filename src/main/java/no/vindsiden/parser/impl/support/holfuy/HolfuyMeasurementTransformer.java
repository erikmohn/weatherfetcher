package no.vindsiden.parser.impl.support.holfuy;

import java.util.Collection;
import java.util.List;

import no.vindsiden.domain.Measurement;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

public class HolfuyMeasurementTransformer {

	public static Collection<Measurement>  transform(List<HolfuyWeatherMeasurement> measurements) {
		return FluentIterable
			.from(measurements)
			.filter(new Predicate<HolfuyWeatherMeasurement>() {

					@Override
					public boolean apply(HolfuyWeatherMeasurement weatherMeasurement) {
						boolean configuredStation = true; 
						try {
							HolfuyStationId.valueOf(weatherMeasurement.getStation().getId());
						} catch (IllegalArgumentException e) {
							configuredStation = false;
							System.out.println("Weatherstation: " + weatherMeasurement.getStation().getId() + " not configured!");
						}
						
						return configuredStation;
					}
				})
			.transform(
				new Function<HolfuyWeatherMeasurement, Measurement>() {

					@Override
					public Measurement apply(
							HolfuyWeatherMeasurement weatherMeasurement) {
						Measurement measurement = new Measurement();
						measurement.setDirectionAvg(weatherMeasurement.getWind().getDir());
						measurement.setTemperature1(weatherMeasurement.getTemp().getTemp());
						measurement.setWindAvg(weatherMeasurement.getWind().getSpeed() * 0.5144);
						measurement.setWindMin(((weatherMeasurement.getWind().getSpeed() * 2) - weatherMeasurement.getWind().getGust()) * 0.5144 );
						measurement.setWindMax(weatherMeasurement.getWind().getGust() * 0.5144);
						measurement.setStationID(HolfuyStationId.valueOf(weatherMeasurement.getStation().getId()).getVindsidenId());
						measurement.setStationName(weatherMeasurement.getStation().getLocation());
						return measurement;
					}
				}).toList();
	}
	
}
