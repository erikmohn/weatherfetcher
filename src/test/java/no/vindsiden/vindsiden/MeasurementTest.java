package no.vindsiden.vindsiden;

import no.vindsiden.vindsiden.Measurement;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class MeasurementTest {
	
	@Test
	public void testXml() {
		Measurement measurement = new Measurement();
		measurement.setTime(new DateTime());
		measurement.setWindAvg(7.7);
		
		System.out.println(measurement.toXml());
	}
	
}
