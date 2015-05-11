package no.vindsiden.parser.impl.support.nlsk;

import java.util.Collection;
import java.util.List;

import no.vindsiden.domain.Measurement;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

public class NLSKMeasurementTransformer {


	public static Collection<Measurement>  transform(List<NLSKWeatherMeasurement> measurements) {
		return FluentIterable
			.from(measurements)
			.filter(new Predicate<NLSKWeatherMeasurement>() {

					@Override
					public boolean apply(NLSKWeatherMeasurement weatherMeasurement) {
						boolean configuredStation = false; 
							for (NLSKStationId id : NLSKStationId.values()) {
								if (id.getNLSKId() == weatherMeasurement.getId()) {
									configuredStation = true;
								}
							}
						if (!configuredStation) {
							System.out.println("Weatherstation: " + weatherMeasurement.getId() + " : "+ weatherMeasurement.getNavn() + " not configured!");
						}
						
						return configuredStation;
					}
				})
			.transform(
				new Function<NLSKWeatherMeasurement, Measurement>() {

					@Override
					public Measurement apply(
							NLSKWeatherMeasurement weatherMeasurement) {
						Measurement measurement = new Measurement();
						measurement.setDirectionAvg(weatherMeasurement.getVindretning());
						measurement.setTemperature1(weatherMeasurement.getTemperatur());
						measurement.setWindAvg(weatherMeasurement.getSnitt15());
						measurement.setWindMin(weatherMeasurement.getMin15());
						measurement.setWindMax(weatherMeasurement.getMax15());
						NLSKStationId station = null;
						for (NLSKStationId id : NLSKStationId.values()) {
							if (id.getNLSKId() == weatherMeasurement.getId()) {
								station = id;
							}
						}
						measurement.setStationID(station.getVindsidenId());
						measurement.setStationName(weatherMeasurement.getNavn());
						return measurement;
					}
				}).toList();
	}
	
	
}
