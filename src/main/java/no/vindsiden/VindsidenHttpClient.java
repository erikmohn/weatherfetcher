package no.vindsiden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import no.vindsiden.domain.Measurement;

import no.vindsiden.parser.VindsidenMeasurment;
import no.vindsiden.parser.impl.support.kystvaer.KystvaerReport;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class VindsidenHttpClient {

	public void sendHttpRequest(Measurement measurement) throws HttpException, IOException {
		
		HttpClient httpClient = new HttpClient();
		GetMethod method = new GetMethod(measurement.toVindSidenUrl());
		httpClient.executeMethod(method);
		method.releaseConnection();
	}

	public Instant getLatestUpdateTimestamp(Measurement measurement) throws IOException {
		String json = fetchContent("http://vindsiden.no/api/stations/" + measurement.getStationID() + "?n=1");
		Gson gson = new GsonBuilder().create();
		VindsidenMeasurment lastMeasurment = gson.fromJson(json, VindsidenMeasurment.class);
		return Instant.parse(lastMeasurment.getLastMeasurementTime());
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
	
}
