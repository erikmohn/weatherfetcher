import org.junit.Before;
import org.junit.Test;

public class WeatherFetcherTest {

	private WeatherFetcher fetcher;
	
	@Before
	public void setUp() {
		fetcher = new WeatherFetcher();
	}
	
	@Test
	public void testExecution() throws Exception {
		
		fetcher.execute();
		
	}

}
