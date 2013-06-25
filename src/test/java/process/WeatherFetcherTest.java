package process;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import process.WeatherFetcher;

import com.thoughtworks.xstream.XStream;

import configuration.Configuration;

import vindsiden.VindsidenHttpClient;

public class WeatherFetcherTest {

	private WeatherFetcher fetcher;
	
	@Mock
	private VindsidenHttpClient vindsidenHttpClientMock;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		XStream xs = new XStream();
		InputStream is = ClassLoader.getSystemResourceAsStream("configuration.xml");
		Configuration config = (Configuration) xs.fromXML(is);
		fetcher = new WeatherFetcher(config);
		fetcher.setHttpClient(vindsidenHttpClientMock);
	}
	
	@Test
	public void testExecution() throws Exception {
		
//		doThrow(new NullPointerException()).when(vindsidenHttpClientMock).sendHttpRequest(any(Measurement.class));

		
		fetcher.execute();
		
	}

}
