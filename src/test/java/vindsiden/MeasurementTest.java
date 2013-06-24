package vindsiden;

import org.joda.time.DateTime;
import org.junit.Test;

public class MeasurementTest {
	
	@Test
	public void testXml() {
		Measurement measurement = new Measurement();
		measurement.setTime(new DateTime());
		measurement.setWindAvg(7.7);
		
		System.out.println(measurement.toXml());
	}
	
}
