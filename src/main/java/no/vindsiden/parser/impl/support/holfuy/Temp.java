package no.vindsiden.parser.impl.support.holfuy;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("temp")
public class Temp {
	
	@XStreamAsAttribute
	private Double temp;
	
	@XStreamAsAttribute
	private String unit;

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
