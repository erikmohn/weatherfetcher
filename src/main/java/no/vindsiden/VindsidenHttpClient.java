package no.vindsiden;

import java.io.IOException;

import no.vindsiden.domain.Measurement;

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
	
}
