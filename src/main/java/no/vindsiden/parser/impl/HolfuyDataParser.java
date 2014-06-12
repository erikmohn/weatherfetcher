package no.vindsiden.parser.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.List;

import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.HolfuyWeatherXML;
import no.vindsiden.parser.impl.support.holfuy.HolfuyStationId;
import no.vindsiden.parser.impl.support.holfuy.Station;
import no.vindsiden.parser.impl.support.holfuy.Temp;
import no.vindsiden.parser.impl.support.holfuy.Timestamp;
import no.vindsiden.parser.impl.support.holfuy.WeatherMeasurement;
import no.vindsiden.parser.impl.support.holfuy.Wind;
import no.vindsiden.vindsiden.Measurement;
import no.vindsiden.weatherstation.WeatherStation;
import no.vindsiden.weatherstation.impl.HolfuyWeatherStation;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.thoughtworks.xstream.XStream;

public class HolfuyDataParser extends WeatherDataParser {

	private Document document;
	private URL url;
	private HolfuyWeatherXML data;

	@SuppressWarnings("rawtypes")
	public HolfuyDataParser(WeatherStation ws) {
		setWeatherStation(ws);
	}

	@Override
	public List<Measurement> fetchMeasurement() throws IOException {
		initializeURLLocation();
		fetchDocument();
		parseXml();

		Collection<Measurement> measurements = Collections2.transform(
				data.getMeasurements(),
				new Function<WeatherMeasurement, Measurement>() {

					@Override
					public Measurement apply(
							WeatherMeasurement weatherMeasurement) {
						Measurement measurement = new Measurement();
						measurement.setDirectionAvg(weatherMeasurement.getWind().getDir());
						measurement.setTemperature1(weatherMeasurement.getTemp().getTemp());
						measurement.setWindAvg(weatherMeasurement.getWind().getSpeed());
						measurement.setWindMin(weatherMeasurement.getWind().getSpeed());
						measurement.setWindMax(weatherMeasurement.getWind().getGust());
						measurement.setStationID(HolfuyStationId.valueOf(weatherMeasurement.getStation().getId()).getVindsidenId());
						return measurement;
					}
				});

		return Lists.newArrayList(measurements);
	}

	private void parseXml() {
		XStream x = new XStream();
		x.alias("holfuyweatherxml", HolfuyWeatherXML.class);
		x.addImplicitCollection(HolfuyWeatherXML.class, "measurements");

		x.alias("weathermeasurement", WeatherMeasurement.class);
		// Station
		x.alias("station", Station.class);
		x.useAttributeFor("id", String.class);
		x.aliasField("id", Station.class, "id");
		x.useAttributeFor("location", String.class);
		x.aliasField("location", Station.class, "location");

		// Timestamp
		x.alias("timestamp", Timestamp.class);
		x.useAttributeFor("date", String.class);
		x.aliasField("date", Timestamp.class, "date");
		x.useAttributeFor("time", String.class);
		x.aliasField("time", Timestamp.class, "time");
		// Wind
		x.alias("wind", Wind.class);
		x.useAttributeFor("speed", Double.class);
		x.aliasField("speed", Wind.class, "speed");
		x.useAttributeFor("gust", Double.class);
		x.aliasField("gust", Wind.class, "gust");
		x.useAttributeFor("unit", String.class);
		x.aliasField("unit", Wind.class, "unit");
		x.useAttributeFor("dir", Integer.class);
		x.aliasField("dir", Wind.class, "dir");
		// Temp
		x.alias("temp", Temp.class);
		x.useAttributeFor("temp", Double.class);
		x.aliasField("temp", Temp.class, "temp");
		x.useAttributeFor("unit", String.class);
		x.aliasField("unit", Temp.class, "unit");

		Element d = document.select("body").first();
		d.select("script").first().remove();

		data = (HolfuyWeatherXML) x.fromXML(d.html());
	}

	private void initializeURLLocation() throws MalformedURLException {
		url = new URL(((HolfuyWeatherStation) getWeatherStation()).getUrl());
	}

	private void fetchDocument() throws IOException {
		document = Jsoup.parse(url.openStream(), "UTF-8",
				((HolfuyWeatherStation) getWeatherStation()).getUrl());
	}

}
