package no.vindsiden.parser.impl;

import com.google.common.collect.Lists;
import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import org.apache.commons.lang.math.NumberUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.List;
import java.util.TimeZone;

public class HvideSandeDataParser extends WeatherDataParser {

    private Document document;

    private URL url;
    private Measurement measurement;

    public HvideSandeDataParser(WeatherStation weatherStation) {
        super(weatherStation);
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

        //Vindstyrke
        Elements e = document.select("table").first().getElementsByTag("td");

        String windGust = e.get(6).html().replace(" m/s", "").trim().replace(",",".");
        String windAverage = e.get(4).html().replace(" m/s", "").trim().replace(",",".");
        String ws = e.get(2).html().replace(" m/s", "").trim().replace(",",".");

        Double avgWindSpeed = parseWindSpeedDouble(windAverage);
        Double windSpeed = parseWindSpeedDouble(ws);
        Double maxWindSpeed = parseWindSpeedDouble(windGust);

        m.setWindAvg(avgWindSpeed);
        m.setWindMin(NumberUtils.min(avgWindSpeed, maxWindSpeed, windSpeed));
        m.setWindMax(NumberUtils.max(avgWindSpeed, maxWindSpeed, windSpeed));

        //Wind direction
        String windDirection = document.select("table").get(1).select("span").first().html().replace("&deg;", "").trim();
        //Air temperature
        String airTemp = document.select("table").get(1).getElementsByTag("td").get(8).html().replace("&deg;&nbsp;C","").trim();


        m.setWindVectorAvg(-999.0);
        m.setWindStDev(0.0);
        m.setDirectionAvg(parseDirection(windDirection));
        m.setDirectionStDev(0.0);

        m.setTemperature1(Double.parseDouble(airTemp.replace(",",".")));

        m.setLight(-999);
        m.setBattery(-999.0);
        measurement = m;

    }


    @Override
    public List<Measurement> fetchMeasurement() throws IOException, ParseException {
        initializeURLLocation();
        fetchDocument();
        parseMeasurement();
        return Lists.newArrayList(measurement);
    }

    private int parseDirection(String direction) {
        Double dir = Double.parseDouble(direction);
        return dir.intValue();
    }

    private double parseWindSpeedDouble(String element) {
        String windSpeed = element.replace("m/s", "").trim();
        return NumberUtils.isNumber(windSpeed) ? Double.parseDouble(windSpeed) : 0;
    }
}
