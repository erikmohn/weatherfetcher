package no.vindsiden.parser.impl;

import junit.framework.TestCase;
import no.vindsiden.weatherstation.impl.DavisWeatherStation;

import org.junit.Test;

public class DavisDataParserTest extends TestCase {

	@Test
	public void testDavisWeatherStation() throws Exception {
		DavisWeatherStation weatherStation = new DavisWeatherStation(1, DavisDataParser.class, null);
		weatherStation.setUrl("http://www.moss-havn.no/weather/");
		DavisDataParser dataParser = new DavisDataParser(weatherStation);
		
		dataParser.fetchMeasurement();
	}
	
}
