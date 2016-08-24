package no.vindsiden.parser.impl.support.weather.underground;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("current_observation")
public class CurrentObservation {

	public double getTemp_c() {
		return temp_c;
	}
	public void setTemp_c(double temp_c) {
		this.temp_c = temp_c;
	}
	public Integer getWind_degrees() {
		return wind_degrees;
	}
	public void setWind_degrees(Integer wind_degrees) {
		this.wind_degrees = wind_degrees;
	}
	public double getWind_mph() {
		return wind_mph;
	}
	public void setWind_mph(double wind_mph) {
		this.wind_mph = wind_mph;
	}
	public double getWind_gust_mph() {
		return wind_gust_mph;
	}
	public void setWind_gust_mph(double wind_gust_mph) {
		this.wind_gust_mph = wind_gust_mph;
	}
	@XStreamAsAttribute
	double temp_c;
	@XStreamAsAttribute
	Integer wind_degrees;
	@XStreamAsAttribute
	double wind_mph;
	@XStreamAsAttribute
	double wind_gust_mph;
	
	
}
