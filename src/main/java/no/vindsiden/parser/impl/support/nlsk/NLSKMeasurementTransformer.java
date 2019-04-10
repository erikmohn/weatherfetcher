package no.vindsiden.parser.impl.support.nlsk;

import no.vindsiden.domain.Measurement;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NLSKMeasurementTransformer {


	public static Collection<Measurement>  transform(List<NLSKWeatherMeasurement> measurements) {
		return measurements.stream().filter(weatherMeasurement -> {
			boolean configuredStation = false;
			for (NLSKStationId id : NLSKStationId.values()) {
				if (id.getNLSKId() == weatherMeasurement.getId()) {
					configuredStation = true;
				}
			}
			if (!configuredStation) {
				System.out.println("Weatherstation: " + weatherMeasurement.getId() + " : " + weatherMeasurement.getNavn() + " not configured!");
			}

			return configuredStation;
		}).map(weatherMeasurement -> {
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
		}).collect(Collectors.toList());
	}
	
	
}
