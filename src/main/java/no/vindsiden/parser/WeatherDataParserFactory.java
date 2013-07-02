package no.vindsiden.parser;

import no.vindsiden.parser.impl.DavisDataParser;
import no.vindsiden.parser.impl.DavisWeatherLinkDataParser;
import no.vindsiden.parser.impl.WeatherDisplayDataParser;
import no.vindsiden.weatherstation.WeatherStation;


public class WeatherDataParserFactory {

	@SuppressWarnings("unchecked")
	public static WeatherDataParser getInstance(WeatherStation<?> weatherStation) {
		WeatherDataParser parser = null;
		if (weatherStation.getParserClass().toString().equals(DavisWeatherLinkDataParser.class.toString())) {
				parser = new DavisWeatherLinkDataParser((WeatherStation<DavisWeatherLinkDataParser>) weatherStation);				
		}  else if (weatherStation.getParserClass().toString().equals(DavisDataParser.class.toString())) {
			parser = new DavisDataParser((WeatherStation<DavisDataParser>) weatherStation);
		} else if (weatherStation.getParserClass().toString().equals(WeatherDisplayDataParser.class.toString())) {
			parser = new WeatherDisplayDataParser((WeatherStation<WeatherDisplayDataParser>) weatherStation);
		}
		
		return parser;
	}
	
}
