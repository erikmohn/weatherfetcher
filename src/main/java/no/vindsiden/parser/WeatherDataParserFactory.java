package no.vindsiden.parser;

import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.impl.*;

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
            case LEASOE:
                parser = new LaesoeDataParser(weatherStation);
                break;
            case WEATHER_UNDERGROUND:
                parser = new WeatherUndergroundDataParser(weatherStation);
                break;
            case KYSTVAER:
                parser = new KystvaerDataParser(weatherStation);
                break;
            case WEATHERLINK2:
                parser = new Weatherlink2DataParser(weatherStation);
                break;
            default:
                throw new RuntimeException(
                        "No matching parser for weatherstation type!");
        }

        return parser;
    }

}
