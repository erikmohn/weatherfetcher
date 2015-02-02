package no.vindsiden.parser.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.holfuy.HolfuyMeasurementTransformer;
import no.vindsiden.parser.impl.support.holfuy.HolfuyWeatherXML;

import org.apache.commons.lang.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

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

		return Lists.newArrayList(HolfuyMeasurementTransformer
				.transform(holfuyData.getMeasurements()));
	}

	private void parseXml() {
		XStream xStream = new XStream(new DomDriver("UTF-8"));
		xStream.processAnnotations(HolfuyWeatherXML.class);
		xStream.ignoreUnknownElements();
		Element xml = getXml();
		
		holfuyData = (HolfuyWeatherXML) xStream.fromXML(StringEscapeUtils.unescapeHtml(xml.html()));
	}

	private Element getXml() {
		return document.select("body").first();
	}

	private void initializeURLLocation() throws MalformedURLException {
		url = new URL(getWeatherStation().getUrl());
	}

	private void fetchDocument() throws IOException {
		document = Jsoup.parse(url.openStream(), "UTF-8", getWeatherStation()
				.getUrl());
	}

}
