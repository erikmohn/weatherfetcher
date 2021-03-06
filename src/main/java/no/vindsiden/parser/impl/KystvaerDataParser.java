package no.vindsiden.parser.impl;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.kystvaer.KystvaerIdMapping;
import no.vindsiden.parser.impl.support.kystvaer.KystvaerReport;
import org.apache.commons.lang.math.NumberUtils;
import org.joda.time.DateTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.List;

public class KystvaerDataParser extends WeatherDataParser {


    public KystvaerDataParser(WeatherStation weatherStation) {
        super(weatherStation);
    }

    @Override
    public List<Measurement> fetchMeasurement() throws IOException {
        List<Measurement> measuerments = Lists.newArrayList();

        for (KystvaerIdMapping station : KystvaerIdMapping.values()) {

            String url = "http://mobvaer.kystverket.no/v1/api/stations/" + station.getKystvaerId();
            String content = fetchContent(url);
            Gson gson = new GsonBuilder().create();
            KystvaerReport report = gson.fromJson(content, KystvaerReport.class);

            Measurement m = new Measurement();
            m.setStationName(station.name());
            m.setStationID(station.getVindsidenId());
            m.setWindMax(NumberUtils.max(report.getWindNow(), report.getWindMax(), report.getWindAvg()));
            m.setWindMin(NumberUtils.min(report.getWindNow(), report.getWindMax(), report.getWindAvg()));
            m.setWindAvg(report.getWindAvg());
            m.setDirectionAvg(report.getWindDirection().intValue());
            m.setTemperature1(0.0);

            m.setTimestamp(report.getTimeStamp());
            measuerments.add(m);
        }
        return measuerments;
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
