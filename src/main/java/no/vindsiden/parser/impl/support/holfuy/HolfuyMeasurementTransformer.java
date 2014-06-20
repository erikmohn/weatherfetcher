package no.vindsiden.parser.impl.support.holfuy;

import java.util.Collection;
import java.util.List;

import no.vindsiden.vindsiden.Measurement;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

public class HolfuyMeasurementTransformer {

	public static Collection<Measurement>  transform(List<WeatherMeasurement> measurements) {
		return FluentIterable
			.from(measurements)
			.filter(new Predicate<WeatherMeasurement>() {

					@Override
					public boolean apply(WeatherMeasurement weatherMeasurement) {
						boolean configuredStation = true; 
						try {
							HolfuyStationId.valueOf(weatherMeasurement.getStation().getId());
						} catch (Exception e) {
							configuredStation = false;
							System.out.println("Weatherstation: " + weatherMeasurement.getStation().getId() + " not configured!");
						}
						
						return configuredStation;
					}
				})
			.transform(
				new Function<WeatherMeasurement, Measurement>() {

					@Override
					public Measurement apply(
							WeatherMeasurement weatherMeasurement) {
						Measurement measurement = new Measurement();
						measurement.setDirectionAvg(weatherMeasurement.getWind().getDir());
						measurement.setTemperature1(weatherMeasurement.getTemp().getTemp());
						measurement.setWindAvg(weatherMeasurement.getWind().getSpeed());
						measurement.setWindMin((weatherMeasurement.getWind().getSpeed() * 2) - weatherMeasurement.getWind().getGust() );
						measurement.setWindMax(weatherMeasurement.getWind().getGust());
						measurement.setStationID(HolfuyStationId.valueOf(weatherMeasurement.getStation().getId()).getVindsidenId());
						measurement.setStationName(weatherMeasurement.getStation().getLocation());
						return measurement;
					}
				}).toList();
	}
	
}
