package no.vindsiden.parser.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.TimeZone;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;

import org.apache.commons.lang.math.NumberUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.google.common.collect.Lists;


/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class LaesoeDataParser extends WeatherDataParser {

	private Document document;

	private URL url;
	private Measurement measurement;
	
	public LaesoeDataParser(WeatherStation weatherStation)  {
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
		url = new URL(getWeatherStation().getUrl());
	}
	
	private void fetchDocument() throws IOException {
		document = Jsoup.parse(url, 1000);
	}
	
	
	private void parseMeasurement() {
		Measurement m = new Measurement();		
		m.setStationID(getWeatherStation().getWeatherStationId());	
		
		m.setTime(new DateTime(DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/Oslo"))));
		
		//Wind gust
		String windGust = document.select("span#lblVindStod").first().html();		
		//Wind average
		String windAverage = document.select("span#lblVindMidd").first().html();		
		//Wind direction
		String windDirection = document.select("span#lblVindRetn").first().html();		
		//Air temperature
		String airTemp = document.select("span#lblLuftTemp").first().html();
		
		Double avgWindSpeed = parseWindSpeedDouble(windAverage); 
		Double windSpeed = parseWindSpeedDouble(windAverage);
		Double maxWindSpeed = parseWindSpeedDouble(windGust);
				
		m.setWindAvg(avgWindSpeed);
		m.setWindMin(NumberUtils.min(avgWindSpeed, maxWindSpeed, windSpeed));
		m.setWindMax(NumberUtils.max(avgWindSpeed, maxWindSpeed, windSpeed));
		
		m.setWindVectorAvg(-999.0);
		m.setWindStDev(0.0);
		m.setDirectionAvg(parseDirection(windDirection));
		m.setDirectionStDev(0.0);
		
		m.setTemperature1(Double.parseDouble(airTemp.replace("C", "").replace("Luft:", "").replace("&deg;", "").trim()));
		
		m.setLight(-999);
		m.setBattery(-999.0);
		measurement = m;
	}
	
	private int parseDirection(String element) {
		String direction = element.replace("&deg;", "").trim();
		Double dir = Double.parseDouble(direction);
		return dir.intValue();	
				}

	private double parseWindSpeedDouble(String element) {		
		String windSpeed = element.replace("m/s", "").trim();		
		return NumberUtils.isNumber(windSpeed) ? Double.parseDouble(windSpeed) : 0;
	}
}
