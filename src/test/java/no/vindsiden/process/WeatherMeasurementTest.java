package no.vindsiden.process;

import java.io.File;

import no.vindsiden.parser.impl.support.JodaTimeConverter;
import no.vindsiden.parser.impl.support.WeatherReport;
import no.vindsiden.parser.impl.support.holfuy.HolfuyWeatherXML;
import no.vindsiden.parser.impl.support.holfuy.Station;
import no.vindsiden.parser.impl.support.holfuy.Temp;
import no.vindsiden.parser.impl.support.holfuy.Timestamp;
import no.vindsiden.parser.impl.support.holfuy.WeatherMeasurement;
import no.vindsiden.parser.impl.support.holfuy.Wind;

import org.junit.Ignore;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

public class WeatherMeasurementTest {
	
	@Test
	@Ignore
	public void testSomething() {
		
		XStream x = new XStream();
		x.registerConverter(new JodaTimeConverter());
		x.alias("WeatherMeasurement", WeatherMeasurement.class);
		x.alias("WeatherReport", WeatherReport.class);
		
	
		
	}

	@Test
	public void parseFromXml() {
		XStream x = new XStream();
		x.alias("HolfuyWeatherXML", HolfuyWeatherXML.class);
		x.addImplicitCollection(HolfuyWeatherXML.class, "measurements");
		
		x.alias("WeatherMeasurement", WeatherMeasurement.class);
		//Station
		x.alias("station", Station.class);
		x.useAttributeFor("id", String.class);
		x.aliasField("id", Station.class, "id");
		x.useAttributeFor("location", String.class);
		x.aliasField("location", Station.class, "location");
		
		//Timestamp
		x.alias("timestamp", Timestamp.class);
		x.useAttributeFor("date", String.class);
		x.aliasField("date", Timestamp.class, "date");
		x.useAttributeFor("time", String.class);
		x.aliasField("time", Timestamp.class, "time");
		//Wind
		x.alias("wind", Wind.class);
		x.useAttributeFor("speed", Double.class);
		x.aliasField("speed", Wind.class, "speed");
		x.useAttributeFor("gust", Double.class);
		x.aliasField("gust", Wind.class, "gust");
		x.useAttributeFor("unit", String.class);
		x.aliasField("unit", Wind.class, "unit");
		//Temp
		x.alias("temp",Temp.class);
		x.useAttributeFor("temp", Double.class);
		x.aliasField("temp", Temp.class, "temp");
		x.useAttributeFor("unit", String.class);
		x.aliasField("unit", Temp.class, "unit");
		
		HolfuyWeatherXML xml = (HolfuyWeatherXML) x.fromXML(new File("C:/projects/vindsiden.no/holfuyExample.xml"));
		
		System.out.println(x.toXML(xml));
	}
}
