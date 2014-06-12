package no.vindsiden.parser.impl.support.holfuy;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("timestamp")
public class Timestamp {

	@XStreamAsAttribute
	private String date;
	
	@XStreamAsAttribute
	private String time;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
