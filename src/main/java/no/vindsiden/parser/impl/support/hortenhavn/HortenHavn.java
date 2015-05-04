package no.vindsiden.parser.impl.support.hortenhavn;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("datavalues")
public class HortenHavn {
	
	@XStreamAsAttribute
	double windspd;
	
	@XStreamAsAttribute
	double winddir;
	
	@XStreamAsAttribute
	double temp;

	public double getWindspd() {
		return windspd;
	}

	public void setWindspd(double windspd) {
		this.windspd = windspd;
	}

	public double getWinddir() {
		return winddir;
	}

	public void setWinddir(double winddir) {
		this.winddir = winddir;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	

}
