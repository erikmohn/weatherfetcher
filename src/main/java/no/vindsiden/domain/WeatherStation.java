package no.vindsiden.domain;

import java.io.IOException;
import java.util.List;

import no.vindsiden.parser.WeatherDataParserFactory;
import no.vindsiden.parser.impl.support.WindUnitType;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
@XStreamAlias("weatherstation")
public class WeatherStation {

	private int weatherStationId;
	private String name;
	private boolean enabled;
	private String url;
	private WindUnitType windUnitType;
	private WeatherStationType type;

	private String username;
	private String password;
	private String token;

	public List<Measurement> fetchMeasurement() throws Exception {
		return Lists.newArrayList(WeatherDataParserFactory.getInstance(this)
				.fetchMeasurement());
	}

	public void setWeatherStationId(int weatherStationId) {
		this.weatherStationId = weatherStationId;
	}

	public int getWeatherStationId() {
		return weatherStationId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public String toString() {
		return getName();
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public WindUnitType getWindUnitType() {
		return windUnitType;
	}

	public void setWindUnitType(WindUnitType windUnitType) {
		this.windUnitType = windUnitType;
	}

	public WeatherStationType getType() {
		return type;
	}

	public void setStationType(WeatherStationType stationType) {
		this.type = stationType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
