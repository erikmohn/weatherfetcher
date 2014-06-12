package no.vindsiden.parser.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.holfuy.HolfuyMeasurementTransformer;
import no.vindsiden.parser.impl.support.holfuy.HolfuyWeatherXML;
import no.vindsiden.vindsiden.Measurement;
import no.vindsiden.weatherstation.WeatherStation;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.XStream;

public class HolfuyDataParser extends WeatherDataParser {

	private Document document;
	private URL url;
	private HolfuyWeatherXML holfuyData;

	public HolfuyDataParser(WeatherStation weatherStation) {
		super(weatherStation);
	}

	@Override
	public List<Measurement> fetchMeasurement() throws IOException {
		initializeURLLocation();
		fetchDocument();
		parseXml();
		return Lists.newArrayList(HolfuyMeasurementTransformer.transform(holfuyData));
	}

	private void parseXml() {
		XStream xStream = new XStream();
		xStream.processAnnotations(HolfuyWeatherXML.class);
		Element d = document.select("body").first();
		d.select("script").first().remove();

		holfuyData = (HolfuyWeatherXML) xStream.fromXML(d.html());
	}

	private void initializeURLLocation() throws MalformedURLException {
		url = new URL(getWeatherStation().getUrl());
	}

	private void fetchDocument() throws IOException {
		document = Jsoup.parse(url.openStream(), "UTF-8",getWeatherStation().getUrl());
	}

}
