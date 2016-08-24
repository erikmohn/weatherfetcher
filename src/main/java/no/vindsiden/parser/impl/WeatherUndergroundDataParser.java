package no.vindsiden.parser.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.TimeZone;

import org.apache.commons.lang.math.NumberUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.XStream;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.weather.underground.CurrentObservation;
import no.vindsiden.parser.impl.support.weather.underground.WeatherUndergroundResponse;

public class WeatherUndergroundDataParser extends WeatherDataParser {

	private String weatherUndergroundURL = "http://api.wunderground.com/api/0998f3f1c1362898/conditions/q/pws:IRYGGE3.xml";
	
	private Document document;

	private URL url;
	private Measurement measurement;
	
	public WeatherUndergroundDataParser(WeatherStation weatherStation)  {
		super(weatherStation);
	}

	@Override
	public List<Measurement> fetchMeasurement() throws IOException {
		initializeURLLocation();
		fetchDocument();		
		parseMeasurement();
		return Lists.newArrayList(measurement);
	}
	
	private void initializeURLLocation() throws MalformedURLException {
		url = new URL(weatherUndergroundURL);
	}
	
	private void fetchDocument() throws IOException {
		document = Jsoup.parse(url, 1000);
	}
	
	
	private void parseMeasurement() {
		Measurement m = new Measurement();		
		m.setStationID(getWeatherStation().getWeatherStationId());	
		
		m.setTime(new DateTime(DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/Oslo"))));
		
		XStream xStream = new XStream();
		xStream.processAnnotations(WeatherUndergroundResponse.class);
		xStream.ignoreUnknownElements();

		String xml = document.getElementsByTag("body").html().replaceAll("\\s+", "");
		WeatherUndergroundResponse response = (WeatherUndergroundResponse) xStream.fromXML(xml);
		CurrentObservation currentObservation = response.getCurrent_observation();
				
		Double avgWindSpeed = getMS(currentObservation.getWind_mph()); 
		Double windSpeed = getMS(currentObservation.getWind_mph());
		Double maxWindSpeed = getMS(currentObservation.getWind_gust_mph());
				
		m.setWindAvg(avgWindSpeed);
		m.setWindMin(NumberUtils.min(avgWindSpeed, maxWindSpeed, windSpeed));
		m.setWindMax(NumberUtils.max(avgWindSpeed, maxWindSpeed, windSpeed));
		
		m.setWindVectorAvg(-999.0);
		m.setWindStDev(0.0);
		m.setDirectionAvg(currentObservation.getWind_degrees());
		m.setDirectionStDev(0.0);
		
		m.setTemperature1(currentObservation.getTemp_c());
		
		m.setLight(-999);
		m.setBattery(-999.0);
		measurement = m;
	}
	
	private Double getMS(double wind_mph) {
		return wind_mph * 0.44704;
	}
}
