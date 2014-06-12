package no.vindsiden.parser;

import java.io.IOException;
import java.util.List;

import no.vindsiden.vindsiden.Measurement;
import no.vindsiden.weatherstation.WeatherStation;



/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public abstract class WeatherDataParser {

	private WeatherStation<?> weatherStation;
	
	public abstract List<Measurement> fetchMeasurement() throws IOException;

	public void setWeatherStation(WeatherStation<?> weatherStation) {
		this.weatherStation =  weatherStation;
	}

	public WeatherStation<?> getWeatherStation() {
		return weatherStation;
	}
	
}
