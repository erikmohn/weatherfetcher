package vindsiden;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class VindsidenHttpClient {

	public void sendHttpRequest(Measurement measurement) throws HttpException, IOException {
		
		HttpClient client = new HttpClient();
		GetMethod get = new GetMethod(measurement.toVindSidenUrl());
		client.executeMethod(get);
	}
	
}
