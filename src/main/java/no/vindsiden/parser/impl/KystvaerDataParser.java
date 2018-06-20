package no.vindsiden.parser.impl;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.kystvaer.KystvaerReport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class KystvaerDataParser extends WeatherDataParser {


    public KystvaerDataParser(WeatherStation weatherStation) {
        super(weatherStation);
    }

    @Override
    public List<Measurement> fetchMeasurement() throws IOException {
        String url = "http://mobvaer.kystverket.no/v1/api/stations/6895049";
        String content = fetchContent(url);

        Gson gson = new GsonBuilder().create();
        KystvaerReport report = gson.fromJson(content, KystvaerReport.class);

        Measurement m = new Measurement();

        m.setStationID(getWeatherStation().getWeatherStationId());
        m.setWindMax(report.getWindMax());
        m.setWindMin(report.getWindNow());
        m.setWindAvg(report.getWindAvg());
        m.setDirectionAvg(report.getWindDirection().intValue());
        m.setTemperature1(0.0);
        return Lists.newArrayList(m);
    }

    private String fetchContent(String uri) throws IOException {

        final int OK = 200;
        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

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

}
