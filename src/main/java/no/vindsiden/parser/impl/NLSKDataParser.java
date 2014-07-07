package no.vindsiden.parser.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.nlsk.NLSKMeasurementTransformer;
import no.vindsiden.parser.impl.support.nlsk.NLSKWeatherReport;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.XStream;

public class NLSKDataParser extends WeatherDataParser {

	private Document document;
	private URL url;
	private NLSKWeatherReport report;
	
	public NLSKDataParser(WeatherStation weatherStation) {
		super(weatherStation);
	}

	@Override
	public List<Measurement> fetchMeasurement() throws IOException {
		initializeURLLocation();
		fetchDocument();
		parseXml();

		return Lists.newArrayList(NLSKMeasurementTransformer
				.transform(report.getMeasurements()));
	}

	private void parseXml() {
		XStream xStream = new XStream();
		xStream.processAnnotations(NLSKWeatherReport.class);
		Element xml = getXml();
		
		report =  (NLSKWeatherReport) xStream.fromXML(xml.html());	
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
