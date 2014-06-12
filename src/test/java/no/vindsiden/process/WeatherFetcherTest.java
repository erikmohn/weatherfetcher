package no.vindsiden.process;
import java.io.UnsupportedEncodingException;

import no.vindsiden.configuration.Configuration;
import no.vindsiden.parser.impl.DavisDataParser;
import no.vindsiden.parser.impl.NortekDataParser;
import no.vindsiden.parser.impl.WeatherDisplayDataParser;
import no.vindsiden.parser.impl.support.WindUnitType;
import no.vindsiden.vindsiden.VindsidenHttpClient;
import no.vindsiden.weatherstation.impl.DavisWeatherLinkWeatherStation;
import no.vindsiden.weatherstation.impl.DavisWeatherStation;
import no.vindsiden.weatherstation.impl.HolfuyWeatherStation;
import no.vindsiden.weatherstation.impl.NortekWeatherStation;
import no.vindsiden.weatherstation.impl.WeatherDisplayWeatherStation;

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
	public void setUp() throws UnsupportedEncodingException {
		MockitoAnnotations.initMocks(this);		
		
		Configuration config = new Configuration();
		config.setVindSidenUrl("http://www.vindsiden.no/wrm.aspx");
		config.setTimeToSleepBeforeErrorHandling(100L);

		DavisWeatherStation ws = new DavisWeatherStation(52, DavisDataParser.class, "Moss havn");
		ws.setUrl("http://www.moss-havn.no/weather/upload/");
		ws.setEnabled(true);
		ws.setWindUnitType(WindUnitType.MS);
		
		DavisWeatherLinkWeatherStation ws2 = new DavisWeatherLinkWeatherStation(51, "http://www.weatherlink.com/user/srfsnosk8hvasser/index.php?view=summary&amp;amp;headers=0", "SrfSnoSk8 Hvasser");
		ws2.setEnabled(true);
		
		WeatherDisplayWeatherStation ws3 = new WeatherDisplayWeatherStation(99, WeatherDisplayDataParser.class, "Kystvind");
		ws3.setUrl("http://kystvind.no/");
		ws3.setEnabled(true);
		
		NortekWeatherStation ws4 = new NortekWeatherStation(56, NortekDataParser.class, "Steilene");
		ws4.setEnabled(true);
		ws4.setUrl("http://www.steilene.nortek.no/");

		DavisWeatherStation ws5 = new DavisWeatherStation(52, DavisDataParser.class, "Torkildstranda");
		ws5.setUrl("http://www.nodeland.no/raasport");
		ws5.setEnabled(true);
		ws5.setWindUnitType(WindUnitType.KNOTS);
		
//		config.addWeatherStation(ws);
//		config.addWeatherStation(ws2);
//		config.addWeatherStation(ws3);
//		config.addWeatherStation(ws4);
		
		HolfuyWeatherStation h = new HolfuyWeatherStation(123, "http://holfuy.hu/en/takeit/vindsiden.php", "Foo");
		h.setEnabled(true);
		config.addWeatherStation(h);
		
		System.out.println(new XStream().toXML(config));
		
		fetcher = new WeatherFetcher(config);
		fetcher.setHttpClient(vindsidenHttpClientMock);
	}
	
	@Test
	public void testExecution() throws Exception {		
		fetcher.execute();
		
	}

}
