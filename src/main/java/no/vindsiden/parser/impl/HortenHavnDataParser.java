package no.vindsiden.parser.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.holfuy.HolfuyMeasurementTransformer;
import no.vindsiden.parser.impl.support.holfuy.HolfuyWeatherXML;
import no.vindsiden.parser.impl.support.hortenhavn.HortenHavn;

import org.apache.commons.lang.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class HortenHavnDataParser extends WeatherDataParser {

	private Document document;
	private URL url;
	private HortenHavn data;

	public HortenHavnDataParser(WeatherStation weatherStation) {
		super(weatherStation);
	}

	@Override
	public List<Measurement> fetchMeasurement() throws IOException {
		initializeURLLocation();
		fetchDocument();
		parseXml();

		Measurement measurement = new Measurement();
		measurement.setDirectionAvg((int) data.getWinddir());
		measurement.setTemperature1(data.getTemp());
		measurement.setWindAvg(data.getWindspd());
		measurement.setWindMin(data.getWindspd());
		measurement.setWindMax(data.getWindspd());
		measurement.setStationID(getWeatherStation().getWeatherStationId());
		measurement.setStationName(getWeatherStation().getName());
		
		List<Measurement> result = new ArrayList<Measurement>();
		result.add(measurement);
		return result;
	}

	private void parseXml() {
		XStream xStream = new XStream(new DomDriver("UTF-8"));
		xStream.processAnnotations(HortenHavn.class);
		xStream.ignoreUnknownElements();
		Element xml = getXml();
		
		data = (HortenHavn) xStream.fromXML(StringEscapeUtils.unescapeHtml(xml.html()));
	}

	private Element getXml() {
		return document.body();
	}

	private void initializeURLLocation() throws MalformedURLException {
		url = new URL(getWeatherStation().getUrl());
	}

	private void fetchDocument() throws IOException {
		document = Jsoup.parse(url.openStream(), "UTF-8", getWeatherStation()
				.getUrl());
	}

}
