package no.vindsiden.vindsiden;
import java.io.UnsupportedEncodingException;

import no.vindsiden.configuration.Configuration;
import no.vindsiden.vindsiden.VindsidenHttpClient;
import no.vindsiden.vindsiden.WeatherFetcher;
import no.vindsiden.vindsiden.WeatherStation;
import no.vindsiden.vindsiden.WeatherStationType;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class WeatherFetcherTest {

	private WeatherFetcher fetcher;
	private Configuration configuration;
	
	@Mock
	private VindsidenHttpClient vindsidenHttpClientMock;
	
	@Before
	public void setUp() throws UnsupportedEncodingException {
		MockitoAnnotations.initMocks(this);		
		
		configuration = new Configuration();
		configuration.setVindSidenUrl("http://www.vindsiden.no/wrm.aspx");
		configuration.setTimeToSleepBeforeErrorHandling(100L);

//		DavisWeatherStation ws = new DavisWeatherStation(52, "Moss havn");
//		ws.setUrl("http://www.moss-havn.no/weather/upload/");
//		ws.setEnabled(true);
//		ws.setWindUnitType(WindUnitType.MS);
//		
//		DavisWeatherLinkWeatherStation ws2 = new DavisWeatherLinkWeatherStation(51, "http://www.weatherlink.com/user/srfsnosk8hvasser/index.php?view=summary&amp;amp;headers=0", "SrfSnoSk8 Hvasser");
//		ws2.setEnabled(true);
//		
//		WeatherDisplayWeatherStation ws3 = new WeatherDisplayWeatherStation(99,"Kystvind");
//		ws3.setUrl("http://kystvind.no/");
//		ws3.setEnabled(true);
//		
//		NortekWeatherStation ws4 = new NortekWeatherStation(56, "Steilene");
//		ws4.setEnabled(true);
//		ws4.setUrl("http://www.steilene.nortek.no/");
//
//		DavisWeatherStation ws5 = new DavisWeatherStation(52, "Torkildstranda");
//		ws5.setUrl("http://www.nodeland.no/raasport");
//		ws5.setEnabled(true);
//		ws5.setWindUnitType(WindUnitType.KNOTS);
		
//		config.addWeatherStation(ws);
//		config.addWeatherStation(ws2);
//		config.addWeatherStation(ws3);
//		config.addWeatherStation(ws4);
		
//		HolfuyWeatherStation h = new HolfuyWeatherStation(123, "http://holfuy.hu/en/takeit/vindsiden.php", null);
//		h.setEnabled(true);
//		config.addWeatherStation(h);
		
		
		//System.out.println(new XStream().toXML(config));
		
		
		fetcher = new WeatherFetcher(Configuration.getConfiguration());
		fetcher.setHttpClient(vindsidenHttpClientMock);
	}
	
	@After
	public void tearDown() {
		configuration.clearWeatherStations();
	}
	
	@Test
	public void holfuyExecutionTest() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("Holfuy");
		weatherStation.setStationType(WeatherStationType.HOLFUY);
		weatherStation.setUrl("http://holfuy.hu/en/takeit/vindsiden.php");

		configuration.addWeatherStation(weatherStation);
		
		executeProcess();
		
		fetcher.execute();
	}
	
	@Test
	public void testConfiguration() {
		configuration = Configuration.getConfiguration();
		executeProcess();
		
		fetcher.execute();		
	}

	private void executeProcess() {
		fetcher = new WeatherFetcher(configuration);
		fetcher.setHttpClient(vindsidenHttpClientMock);
	}

}
