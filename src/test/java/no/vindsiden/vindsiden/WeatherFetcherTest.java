package no.vindsiden.vindsiden;
import java.io.UnsupportedEncodingException;

import junit.framework.Assert;
import no.vindsiden.VindsidenHttpClient;
import no.vindsiden.WeatherFetcher;
import no.vindsiden.configuration.Configuration;
import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.domain.WeatherStationType;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
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
	}
	
	@Test
	public void nlskExecutionTest() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("NLSK");
		weatherStation.setStationType(WeatherStationType.NLSK);
		weatherStation.setUrl("http://nlsk.no-ip.org/v%C3%A6rdata.xml");

		configuration.addWeatherStation(weatherStation);
		
		executeProcess();
	}
	
	@Test
	public void testConfiguration() {
		configuration = Configuration.getConfiguration();
		executeProcess();	
	}

	private void executeProcess() {
		fetcher = new WeatherFetcher(configuration);
		fetcher.setHttpClient(vindsidenHttpClientMock);
		fetcher.execute();	
	}
	
	@Test
	public void testMinimumWindZero() {
		Measurement m = new Measurement();
		m.setWindMin(0.0);
		
		Assert.assertEquals(0.0, m.getWindMin());
	}
	
	@Test
	public void testMinimumWindNegative() {
		Measurement m = new Measurement();
		m.setWindMin(-1.0);
		
		Assert.assertEquals(0.0, m.getWindMin());
	}
	
	@Test
	public void testMinimumWindPositive() {
		Measurement m = new Measurement();
		m.setWindMin(1.0);
		
		Assert.assertEquals(1.0, m.getWindMin());
	}

}
