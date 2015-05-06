package no.vindsiden.parser.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import com.google.common.collect.Lists;

import no.vindsiden.domain.Measurement;
import no.vindsiden.domain.WeatherStation;
import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.impl.support.vegvesen.VegvesenStationId;
import eu.datex2.schema._2._2_0.D2LogicalModel;
import eu.datex2.schema._2._2_0.MeasuredDataPublication;
import eu.datex2.schema._2._2_0.SiteMeasurements;
import eu.datex2.schema._2._2_0.SiteMeasurementsIndexMeasuredValue;
import eu.datex2.schema._2._2_0.TemperatureInformation;
import eu.datex2.schema._2._2_0.WindInformation;
import eu.datex2.wsdl.clientpull._2_0.ClientPullService;

public class DatexIIDataParser extends WeatherDataParser {

	public DatexIIDataParser(WeatherStation weatherStation) {
		super(weatherStation);
	}

	@Override
	public List<Measurement> fetchMeasurement() throws IOException {

		ClientPullService service = new ClientPullService();
		
		D2LogicalModel data = service.getClientPullSoapEndPoint().getDatex2Data();
		
		MeasuredDataPublication m =  (MeasuredDataPublication) data.getPayloadPublication();
		
		float windSpeedKmh = -1;
		BigInteger direction = null; 
		float temperature = -1;
		
		for (SiteMeasurements me : m.getSiteMeasurements()) {
			
			if (me.getMeasurementSiteReference().getId().equals(VegvesenStationId.valueOf(getWeatherStation().getName()).getVindsidenId())) {				
				for (SiteMeasurementsIndexMeasuredValue value : me.getMeasuredValue()) {
					if (value.getMeasuredValue().getBasicData() instanceof WindInformation){
						WindInformation wind = (WindInformation) value.getMeasuredValue().getBasicData();
						if (wind.getWind().getWindSpeed() != null) {
							windSpeedKmh = wind.getWind().getWindSpeed().getSpeed();							
						} else {
							if (wind.getWind().getWindDirectionBearing() != null) {
								direction = wind.getWind().getWindDirectionBearing().getDirectionBearing();								
							}
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
	

		double windSpeedMs = Double.valueOf(windSpeedKmh) * 0.27777777777778;
		
		Measurement measurement = new Measurement();
		measurement.setDirectionAvg(direction.intValue());
		measurement.setTemperature1(Double.valueOf(temperature));
		measurement.setWindAvg(windSpeedMs);
		measurement.setWindMin(windSpeedMs);
		measurement.setWindMax(windSpeedMs);
		measurement.setStationID(getWeatherStation().getWeatherStationId());
		measurement.setStationName(getWeatherStation().getName());
		
		return Lists.newArrayList(measurement);
	}

	
	
}
