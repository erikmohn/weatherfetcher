package no.vindsiden.parser.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.WindUnitType;

import org.apache.commons.lang.math.NumberUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.common.collect.Lists;


/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class DavisWeatherLinkDataParser extends WeatherDataParser {

	private Document document;
	private Map<String, List<String>> data;
	private URL url;
	private Measurement measurement;
	
	public DavisWeatherLinkDataParser(WeatherStation weatherStation)  {
		super(weatherStation);
		data = new HashMap<String, List<String>>();
	}

	@Override
	public List<Measurement> fetchMeasurement() throws IOException {
		initializeURLLocation();
		fetchDocument();
		parseDocument();
		parseMeasurement();
		return Lists.newArrayList(measurement);
	}
	
	private void initializeURLLocation() throws MalformedURLException {
		url = new URL(getWeatherStation().getUrl());
	}
	
	private void fetchDocument() throws IOException {
		document = Jsoup.parse(url, 1000);
	}
	
	private void parseDocument() {
		for (Element row : document.select("tr")) {
			parseContentFromRow(row);
		}
	}

	private void parseContentFromRow(Element row) {
		Elements collumns = row.select("td");
		
		List<String> content = new ArrayList<String>();
		for (Element column : collumns) {
			content.add(column.text().trim());
		}
		data.put(collumns.first().text().trim(), content);
	}
	
	private void parseMeasurement() {
		Measurement m = new Measurement();		
		m.setStationID(getWeatherStation().getWeatherStationId());	
		m.setTime(new DateTime(DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/Oslo"))));
		
		WindUnitType windUnit = getWeatherStation().getWindUnitType();
		
		Double avgWindSpeed = parseWindSpeedDouble("Average Wind Speed", 2); 
		Double windSpeed = parseWindSpeedDouble("Wind Speed", 1);
		Double maxWindSpeed = parseWindSpeedDouble("Wind Gust Speed", 2);
		
		if (windUnit == WindUnitType.KNOTS) {
			avgWindSpeed = avgWindSpeed * 0.5144;
			windSpeed = windSpeed * 0.5144;
			maxWindSpeed = windSpeed * 0.5144;
		}
		
		m.setWindAvg(avgWindSpeed);
		m.setWindMin(NumberUtils.min(avgWindSpeed, maxWindSpeed, windSpeed));
		m.setWindMax(NumberUtils.max(avgWindSpeed, maxWindSpeed, windSpeed));
		
		m.setWindVectorAvg(-999.0);
		m.setWindStDev(0.0);
		m.setDirectionAvg(parseDirection());
		m.setDirectionStDev(0.0);
		m.setTemperature1(Double.parseDouble(data.get("Outside Temp").get(1).replace("C", "")));
		m.setTemperature2(-999.0);
		m.setLight(-999);
		m.setBattery(-999.0);
		measurement = m;
	}
	
	private int parseDirection() {
		String directionRaw = data.get("Wind Direction").get(1).replaceAll("\\D+","");
		
		return Integer.parseInt(directionRaw);
	}

	private double parseWindSpeedDouble(String key, int pos) {
		return Double.parseDouble(data.get(key).get(pos).replace("m/s", "").replace("KT","").trim());
	}
}
