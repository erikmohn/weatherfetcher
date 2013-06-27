package no.vindsiden.process;
import no.vindsiden.configuration.Configuration;
import no.vindsiden.parser.impl.DavisDataParser;
import no.vindsiden.parser.impl.DavisWeatherLinkDataParser;
import no.vindsiden.process.WeatherFetcher;
import no.vindsiden.vindsiden.VindsidenHttpClient;
import no.vindsiden.weatherstation.impl.DavisWeatherLinkWeatherStation;
import no.vindsiden.weatherstation.impl.DavisWeatherStation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.thoughtworks.xstream.XStream;


/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class WeatherFetcherTest {

	private WeatherFetcher fetcher;
	
	@Mock
	private VindsidenHttpClient vindsidenHttpClientMock;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);		
		
		Configuration config = new Configuration();
		config.setVindSidenUrl("http://www.vindsiden.no/wrm.aspx");
		DavisWeatherStation ws = new DavisWeatherStation(52, DavisDataParser.class);
		ws.setDavisBaseUrl("http://www.moss-havn.no/weather/upload/");
		
		DavisWeatherLinkWeatherStation ws2 = new DavisWeatherLinkWeatherStation(51, "http://www.weatherlink.com/user/srfsnosk8hvasser/index.php?view=summary&amp;amp;headers=0");
		
		config.addWeatherStation(ws);
		config.addWeatherStation(ws2);
		
		System.out.println(new XStream().toXML(config));
		
		fetcher = new WeatherFetcher(config);
		fetcher.setHttpClient(vindsidenHttpClientMock);
	}
	
	@Test
	public void testExecution() throws Exception {		
		fetcher.execute();
		
	}

}
