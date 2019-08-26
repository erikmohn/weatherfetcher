package no.vindsiden.vindsiden;

import no.vindsiden.parser.impl.Weatherlink2DataParser;
import org.junit.Assert;
import no.vindsiden.VindsidenHttpClient;
import no.vindsiden.WeatherFetcher;
import no.vindsiden.configuration.Configuration;
import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.domain.WeatherStationType;
import no.vindsiden.parser.impl.support.WindUnitType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;


/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class WeatherFetcherTest {

	private WeatherFetcher fetcher;
	private Configuration configuration;
	
	@Mock
	private VindsidenHttpClient vindsidenHttpClientMock ;
	
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
	public void testMossHavn() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("Moss Havn");
		weatherStation.setStationType(WeatherStationType.DAVIS);
		weatherStation.setUrl("http://weather.moss-havn.no/");
		weatherStation.setWindUnitType(WindUnitType.KNOTS);
		
		configuration.addWeatherStation(weatherStation);
		
		executeProcess();
	}

	@Test
	public void testKystVaer() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setStationType(WeatherStationType.KYSTVAER);
		configuration.addWeatherStation(weatherStation);
		fetcher = new WeatherFetcher(configuration);
		fetcher.setHttpClient(new VindsidenHttpClient());
		fetcher.execute();
	}

    @Test
    public void testFaerderFyr() {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.setEnabled(true);
        weatherStation.setName("Færder fyr");
        weatherStation.setStationType(WeatherStationType.KYSTVAER);
        weatherStation.setWindUnitType(WindUnitType.MS);

        configuration.addWeatherStation(weatherStation);

        executeProcess();
    }
	
	@Test
	public void holfuyExecutionTest() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("Holfuy");
		weatherStation.setStationType(WeatherStationType.HOLFUY);
		weatherStation.setUrl("http://api.holfuy.com/live/?s=119,124,121,112,118,107,133,134,135,142,165,174,197&tu=C&su=m/s&pw=iXA3mY3kfP&m=XML");

		configuration.addWeatherStation(weatherStation);
		
		executeProcess();
	}

	@Test
	public void weatherlink2Test() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("Rolfstangen");
		weatherStation.setStationType(WeatherStationType.WEATHERLINK2);
		weatherStation.setUsername("na");
		weatherStation.setPassword("na");
		weatherStation.setToken("na");

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
	public void leasoeExecutionTest() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("L�s�");
		weatherStation.setStationType(WeatherStationType.LEASOE);
		weatherStation.setUrl("http://www.laesoe-vejr.dk/");

		configuration.addWeatherStation(weatherStation);
		
		executeProcess();
	}

	@Test
	public void hvideSandeExecutionTest() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("HvideSande");
		weatherStation.setStationType(WeatherStationType.HVIDESANDE);
		weatherStation.setUrl("http://hyde.dk/");

		configuration.addWeatherStation(weatherStation);

		executeProcess();
	}

	@Test
	public void haldenBryggeTest() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("Halden brygge");
		weatherStation.setWindUnitType(WindUnitType.KNOTS);
		weatherStation.setStationType(WeatherStationType.DAVIS_WEATHER_LINK);
		weatherStation.setUrl("http://www.weatherlink.com/user/haldenbrygge/index.php?view=summary&amp;amp;amp;headers=0");

		configuration.addWeatherStation(weatherStation);
		
		executeProcess();
	}
	
	@Test
	public void datexIIExecutionDyranutTest() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("Dyranut");
		weatherStation.setStationType(WeatherStationType.DATEXII);
		weatherStation.setUrl("");

		configuration.addWeatherStation(weatherStation);
		
		executeProcess();
	}
	
	@Test
	public void datexIIExecutionEldrevannTest() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("Eldrevann");
		weatherStation.setStationType(WeatherStationType.DATEXII);
		weatherStation.setUrl("");
		weatherStation.setWeatherStationId(65);

		configuration.addWeatherStation(weatherStation);
		
		executeProcess();
	}
	
	@Test
	public void testHortenHavn() {
		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("Horten havn");
		weatherStation.setWeatherStationId(71);
		weatherStation.setStationType(WeatherStationType.HORTENHAVN);
		weatherStation.setUrl("http://nettkamera.cid.no:8008/000CC80294AC/state.xml");

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
		fetcher.setHttpClient(new VindsidenHttpClient());
		fetcher.execute();	
	}
	
	@Test
	public void testMinimumWindZero() {
		Measurement m = new Measurement();
		m.setWindMin(0.0);

		Assert.assertEquals(0.0, m.getWindMin().doubleValue(), 0);
	}
	
	@Test
	public void testMinimumWindNegative() {
		Measurement m = new Measurement();
		m.setWindMin(-1.0);
		
		Assert.assertEquals(0.0, m.getWindMin().doubleValue(),0);
	}
	
	@Test
	public void testMinimumWindPositive() {
		Measurement m = new Measurement();
		m.setWindMin(1.0);
		
		Assert.assertEquals(1.0, m.getWindMin().doubleValue(),0);
	}
	
	@Test
	public void testWeatherUnderground() throws IOException {

		WeatherStation weatherStation = new WeatherStation();
		weatherStation.setEnabled(true);
		weatherStation.setName("Larkollen");
		weatherStation.setWeatherStationId(71);
		weatherStation.setStationType(WeatherStationType.WEATHER_UNDERGROUND);
		weatherStation.setUrl("n/a");

		configuration.addWeatherStation(weatherStation);
		
		executeProcess();		
		
	}

}
