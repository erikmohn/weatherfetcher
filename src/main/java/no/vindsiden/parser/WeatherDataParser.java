package no.vindsiden.parser;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;



/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public abstract class WeatherDataParser {

	private WeatherStation weatherStation;
	
	public abstract List<Measurement> fetchMeasurement() throws IOException, ParseException;

	@SuppressWarnings("unused")
	private WeatherDataParser() {
		
	}
	
	public WeatherDataParser(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	public WeatherStation getWeatherStation() {
		return weatherStation;
	}
	
}
