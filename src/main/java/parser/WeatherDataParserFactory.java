package parser;

import configuration.WeatherStation;


public class WeatherDataParserFactory {

	@SuppressWarnings("unchecked")
	public static WeatherDataParser getInstance(WeatherStation<?> weatherStation) {
		WeatherDataParser parser = null;
		if (weatherStation.getParserClass().getClass().isInstance(DavisWeatherLinkDataParser.class)) {
				parser = new DavisWeatherLinkDataParser((WeatherStation<DavisWeatherLinkDataParser>) weatherStation);				
		}
		
		return parser;
	}
	
}
