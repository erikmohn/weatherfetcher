package no.vindsiden.parser.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import no.vindsiden.EnvResolver;
import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.VindsidenMeasurment;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.WeatherDataUnavailableException;
import no.vindsiden.parser.impl.support.weatherlink2.DavisCurrentObservation;
import no.vindsiden.parser.impl.support.weatherlink2.WeatherLinkMeasurement;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Weatherlink2DataParser extends WeatherDataParser {

    private EnvResolver resolver;

    public Weatherlink2DataParser(WeatherStation weatherStation) {

        super(weatherStation);
    }

    @Override
    public List<Measurement> fetchMeasurement() throws IOException, ParseException {

        String urlWithUserData = "https://api.weatherlink.com/v1/NoaaExt.json?user=USERNAME&pass=PASSORD&apiToken=TOKEN";

        String url = urlWithUserData
                .replace("USERNAME", System.getenv(getWeatherStation().getUsername()))
                .replace("PASSORD", System.getenv(getWeatherStation().getPassword()))
                .replace("TOKEN", System.getenv(getWeatherStation().getToken()));

        String json = fetchContent(url);

        Gson gson = new GsonBuilder().create();
        WeatherLinkMeasurement lastMeasurment = gson.fromJson(json, WeatherLinkMeasurement.class);

        if (lastMeasurment.getWindMph() == null) {
            throw new WeatherDataUnavailableException("No weather data available for weatherstation");
        }

        Measurement m = new Measurement();
        m.setStationID(getWeatherStation().getWeatherStationId());
        m.setTime(new DateTime(DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/Oslo"))));
        m.setWindMin(Math.min(Double.parseDouble(lastMeasurment.getWindMph()), Double.parseDouble(lastMeasurment.getDavisCurrentObservation().getWindTenMinAvgMph()) ) * 0.44704);
        m.setWindAvg(Double.parseDouble(lastMeasurment.getDavisCurrentObservation().getWindTenMinAvgMph()) * 0.44704);
        m.setWindMax(Double.parseDouble(lastMeasurment.getDavisCurrentObservation().getWindTenMinGustMph()) * 0.44704);

        m.setDirectionAvg(Integer.parseInt(lastMeasurment.getWindDegrees()));
        m.setWindStDev(0.0);
        m.setDirectionStDev(0.0);
        m.setTemperature1(Double.parseDouble(lastMeasurment.getTempC()));

        return Stream.of(m).collect(Collectors.toList());
    }

    private String fetchContent(String uri) throws IOException {

        final int OK = 200;
        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        int responseCode = connection.getResponseCode();
        if(responseCode == OK){
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        }

        return null;
    }

    public EnvResolver getResolver() {
        return resolver;
    }

    public void setResolver(EnvResolver resolver) {
        this.resolver = resolver;
    }
}
