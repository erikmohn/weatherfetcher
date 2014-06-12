package no.vindsiden.parser;

import no.vindsiden.parser.impl.DavisDataParser;
import no.vindsiden.parser.impl.DavisWeatherLinkDataParser;
import no.vindsiden.parser.impl.HolfuyDataParser;
import no.vindsiden.parser.impl.NortekDataParser;
import no.vindsiden.parser.impl.WeatherDisplayDataParser;
import no.vindsiden.weatherstation.WeatherStation;
import no.vindsiden.weatherstation.impl.DavisWeatherLinkWeatherStation;
import no.vindsiden.weatherstation.impl.DavisWeatherStation;
import no.vindsiden.weatherstation.impl.HolfuyWeatherStation;
import no.vindsiden.weatherstation.impl.NortekWeatherStation;
import no.vindsiden.weatherstation.impl.WeatherDisplayWeatherStation;


public class WeatherDataParserFactory {


	public static WeatherDataParser getInstance(WeatherStation weatherStation) {
		WeatherDataParser parser = null;
//		weatherStation.getParserClass().toString().equals(DavisWeatherLinkDataParser.class.toString())
		if (weatherStation.getClass().equals(DavisWeatherLinkWeatherStation.class)) {
				parser = new DavisWeatherLinkDataParser(weatherStation);				
		}  else if (weatherStation.getClass().equals(DavisWeatherStation.class)) {
			parser = new DavisDataParser(weatherStation);
		} else if (weatherStation.getClass().equals(WeatherDisplayWeatherStation.class)) {
			parser = new WeatherDisplayDataParser(weatherStation);
		} else if (weatherStation.getClass().equals(NortekWeatherStation.class)) {
			parser = new NortekDataParser(weatherStation);
		} else if (weatherStation.getClass().equals(HolfuyWeatherStation.class)) {
			parser = new HolfuyDataParser(weatherStation);
		}
		
		return parser;
	}
	
}
