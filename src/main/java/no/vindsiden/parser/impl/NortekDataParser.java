package no.vindsiden.parser.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.vindsiden.Measurement;
import no.vindsiden.weatherstation.WeatherStation;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.common.collect.Lists;

public class NortekDataParser extends WeatherDataParser {
	
	public NortekDataParser(WeatherStation weatherStation) {
		super(weatherStation);
	}
	
	@Override
	public List<Measurement> fetchMeasurement() throws IOException {
		Measurement m = null;
		try {
			JSONObject json = readJsonFromUrl(getWeatherStation().getUrl());
			
			m = new Measurement();
			m.setWindAvg(json.getJSONObject("Data").getJSONObject("MetData").getDouble("WindSpeedAverage"));
			m.setDirectionAvg(json.getJSONObject("Data").getJSONObject("MetData").getInt("WindDirectionAverage"));
			m.setWindMax(json.getJSONObject("Data").getJSONObject("MetData").getDouble("WindSpeedMax"));
			m.setWindMin(json.getJSONObject("Data").getJSONObject("MetData").getDouble("WindSpeedAverage"));
			m.setStationID(getWeatherStation().getWeatherStationId());
			m.setTemperature1(json.getJSONObject("Data").getJSONObject("MetData").getDouble("Temperature"));
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return Lists.newArrayList(m);
	}
	
	  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		    InputStream is = new URL(url).openStream();
		    try {
		      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		      String jsonText = readAll(rd);
		      JSONObject json = new JSONObject(jsonText);
		      return json;
		    } finally {
		      is.close();
		    }
		  }
	
	 private static String readAll(Reader rd) throws IOException {
		    StringBuilder sb = new StringBuilder();
		    int cp;
		    while ((cp = rd.read()) != -1) {
		      sb.append((char) cp);
		    }
		    return sb.toString();
		  }

}
