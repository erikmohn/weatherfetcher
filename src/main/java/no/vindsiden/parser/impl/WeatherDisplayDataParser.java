package no.vindsiden.parser.impl;

import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.WindDirection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.common.collect.Lists;

public class WeatherDisplayDataParser extends WeatherDataParser {

	private Document document;
	private URL url;
	private Measurement measurement;
	
	public WeatherDisplayDataParser(WeatherStation weatherStation)  {
		super(weatherStation);
	}
	
	@Override
	public List<Measurement> fetchMeasurement() throws IOException {	
		initializeURLLocation();
		fetchDocument();
		parseMeasurement();
		return Lists.newArrayList(measurement);
	}
	
	private void parseMeasurement() {
		measurement = new Measurement();
		String temperatureString = document.getElementById("ajaxtemp").text();
		measurement.setStationID(getWeatherStation().getWeatherStationId());
		measurement.setTemperature1(parseDoubleText(temperatureString.substring(0, temperatureString.length() - 2)));	
		
		//Hack to be able to parse winddirections with Norwegian character: Ø
		Element e = document.getElementById("ajaxwinddir");
		String elementString = e.toString().replace("&Oslash;", "Ø");
		String direction = elementString.substring(elementString.indexOf(">") + 1, elementString.indexOf("<", elementString.indexOf(">")));

		measurement.setDirectionAvg(WindDirection.getWindDirectionFromString(direction));
		measurement.setWindMin(parseDoubleText(document.getElementById("ajaxwind").text()));
		measurement.setWindAvg(parseDoubleText(document.getElementById("ajaxwind").text()));
		String windGust = document.getElementById("ajaxgust").text();
		measurement.setWindMax(parseDoubleText(windGust.substring(0, windGust.length() - 4)));
	}

	private Double parseDoubleText(String text) {
		return Double.parseDouble(text.replace(",", "."));
	}
	
	private void initializeURLLocation() throws MalformedURLException {
		url = new URL(getWeatherStation().getUrl());
	}
	
	private void fetchDocument() throws IOException {
		document = Jsoup.parse(url.openStream(), "CP1252", getWeatherStation().getUrl());
	}
}
