package parser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import vindsiden.Measurement;
import configuration.DavisWeatherLinkWeatherStation;
import configuration.WeatherStation;

public class DavisWeatherLinkDataParser extends WeatherDataParser<DavisWeatherLinkWeatherStation> {

	private Document document;
	private Map<String, List<String>> data;
	private URL url;
	private Measurement measurement;
	
	public DavisWeatherLinkDataParser(WeatherStation weatherStation)  {
		data = new HashMap<String, List<String>>();
		setWeatherStation(weatherStation);
	}

	@Override
	public Measurement fetchMeasurement() throws IOException {
		initializeURLLocation();
		fetchDocument();
		parseDocument();
		parseMeasurement();
		return measurement;
	}

	private void initializeURLLocation() throws MalformedURLException {
		url = new URL(getWeatherStation().getDavisWeatherLinkUrl());
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
		
		Double avgWindSpeed = parseWindSpeedDouble("Average Wind Speed", 1); 
		Double windSpeed = parseWindSpeedDouble("Wind Speed", 1);
		
		m.setWindAvg(windSpeed < avgWindSpeed ? avgWindSpeed : windSpeed);
		m.setWindMin(windSpeed > avgWindSpeed ? avgWindSpeed : windSpeed);
		m.setWindMax(parseWindSpeedDouble("Wind Gust Speed", 2));
		
		m.setWindVectorAvg(-999.0);
		m.setWindStDev(0.5);
		m.setDirectionAvg(parseDirection());
		m.setDirectionStDev(5.2);
		m.setTemperature1(Double.parseDouble(data.get("Outside Temp").get(1).replace("C", "")));
		m.setTemperature2(-999.0);
		m.setLight(-999);
		m.setBattery(-999.0);
		measurement = m;
	}
	
	private int parseDirection() {
		String directionRaw = data.get("Wind Direction").get(1).replaceAll("\\D+","");;
		
		return Integer.parseInt(directionRaw);
	}

	private double parseWindSpeedDouble(String key, int pos) {
		return Double.parseDouble(data.get(key).get(pos).replace("m/s", "").trim());
	}
}
