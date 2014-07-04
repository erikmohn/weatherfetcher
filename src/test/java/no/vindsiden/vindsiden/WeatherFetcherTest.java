package no.vindsiden.vindsiden;
import java.io.UnsupportedEncodingException;

import no.vindsiden.VindsidenHttpClient;
import no.vindsiden.WeatherFetcher;
import no.vindsiden.configuration.Configuration;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.domain.WeatherStationType;

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
