package no.vindsiden.parser.impl.support.holfuy;

import java.util.Collection;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;

import no.vindsiden.vindsiden.Measurement;

public class HolfuyMeasurementTransformer {

	public static Collection<Measurement>  transform(HolfuyWeatherXML holfuyData) {
		return Collections2.transform(
				holfuyData.getMeasurements(),
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
						return measurement;
					}
				});
	}
	
}
