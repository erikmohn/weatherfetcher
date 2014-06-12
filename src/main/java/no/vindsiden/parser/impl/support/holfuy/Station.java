package no.vindsiden.parser.impl.support.holfuy;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("station")
public class Station {

	@XStreamAsAttribute
	private String id = "foo";
	@XStreamAsAttribute
	private String location = "foo";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
