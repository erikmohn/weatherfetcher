package no.vindsiden.vindsiden;

import java.io.IOException;
import java.math.BigInteger;

import no.vindsiden.domain.Measurement;

import org.junit.Test;

import eu.datex2.schema._2._2_0.D2LogicalModel;
import eu.datex2.schema._2._2_0.MeasuredDataPublication;
import eu.datex2.schema._2._2_0.SiteMeasurements;
import eu.datex2.schema._2._2_0.SiteMeasurementsIndexMeasuredValue;
import eu.datex2.schema._2._2_0.TemperatureInformation;
import eu.datex2.schema._2._2_0.WindInformation;
import eu.datex2.wsdl.clientpull._2_0.ClientPullService;

public class DatexIITest {

	@Test
	public void testExecutionOfWebservice() throws IOException {
		

		ClientPullService service = new ClientPullService();
		
		D2LogicalModel data = service.getClientPullSoapEndPoint().getDatex2Data();
		
		MeasuredDataPublication m =  (MeasuredDataPublication) data.getPayloadPublication();
		
		float windSpeed = -1;
		BigInteger direction = null; 
		float temperature = -1;
		
		for (SiteMeasurements me : m.getSiteMeasurements()) {
			
			if (me.getMeasurementSiteReference().getId().equals("505")) {				
				for (SiteMeasurementsIndexMeasuredValue value : me.getMeasuredValue()) {
					if (value.getMeasuredValue().getBasicData() instanceof WindInformation){
						WindInformation wind = (WindInformation) value.getMeasuredValue().getBasicData();
						if (wind.getWind().getWindSpeed() != null) {
							windSpeed = wind.getWind().getWindSpeed().getSpeed();							
						} else {
							direction = wind.getWind().getWindDirectionBearing().getDirectionBearing();
						}
					}
					
					if (value.getMeasuredValue().getBasicData() instanceof TemperatureInformation) {
						TemperatureInformation temp = (TemperatureInformation) value.getMeasuredValue().getBasicData();
						if (temp.getTemperature().getAirTemperature() != null) {
							temperature = temp.getTemperature().getAirTemperature().getTemperature();
						}
					}
				}
			}
		}		

		System.out.println(temperature);

		Measurement measurement = new Measurement();
		measurement.setDirectionAvg(direction.intValue());
		measurement.setTemperature1(Double.valueOf(temperature));
		measurement.setWindAvg(Double.valueOf(windSpeed));
		measurement.setWindMin(Double.valueOf(windSpeed));
		measurement.setWindMax(Double.valueOf(windSpeed));
		measurement.setStationID(66);
		measurement.setStationName("Dyranut");
		
	}
}
