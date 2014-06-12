package no.vindsiden.parser.impl.support.holfuy;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("wind")
public class Wind {

	private static final Double KMH_TO_KNOTS_CONSTANT = 0.539956803;
	
	@XStreamAsAttribute
	private Double speed;
	
	@XStreamAsAttribute
	private Double gust;
	
	@XStreamAsAttribute
	private Integer dir;
	
	@XStreamAsAttribute
	private String unit;
	
	public double getSpeed() {
		return speed * KMH_TO_KNOTS_CONSTANT;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Double getGust() {
		return gust * KMH_TO_KNOTS_CONSTANT;
	}

	public void setGust(Double gust) {
		this.gust = gust;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getDir() {
		return dir;
	}

	public void setDir(Integer dir) {
		this.dir = dir;
	}
}
