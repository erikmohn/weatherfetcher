package no.vindsiden.parser;

import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.impl.DatexIIDataParser;
import no.vindsiden.parser.impl.DavisDataParser;
import no.vindsiden.parser.impl.DavisWeatherLinkDataParser;
import no.vindsiden.parser.impl.HolfuyDataParser;
import no.vindsiden.parser.impl.HortenHavnDataParser;
import no.vindsiden.parser.impl.NLSKDataParser;
import no.vindsiden.parser.impl.NortekDataParser;
import no.vindsiden.parser.impl.WeatherDisplayDataParser;

public class WeatherDataParserFactory {

	public static WeatherDataParser getInstance(WeatherStation weatherStation) {

		WeatherDataParser parser = null;

		switch (weatherStation.getType()) {
		case DAVIS_WEATHER_LINK:
			parser = new DavisWeatherLinkDataParser(weatherStation);
			break;
		case DAVIS:
			parser = new DavisDataParser(weatherStation);
			break;
		case WEATHERDISPLAY:
			parser = new WeatherDisplayDataParser(weatherStation);
			break;
		case NORTEK:
			parser = new NortekDataParser(weatherStation);
			break;
		case HOLFUY:
			parser = new HolfuyDataParser(weatherStation);
			break;
		case NLSK:
			parser = new NLSKDataParser(weatherStation);
			break;
		case DATEXII:
			parser = new DatexIIDataParser(weatherStation);
			break;
		case HORTENHAVN:
			parser = new HortenHavnDataParser(weatherStation);
			break;
		default:
			throw new RuntimeException(
					"No matching parser for weatherstation type!");
		}

		return parser;
	}

}
