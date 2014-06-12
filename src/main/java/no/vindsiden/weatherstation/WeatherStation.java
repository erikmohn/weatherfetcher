package no.vindsiden.weatherstation;

import java.io.IOException;
import java.util.List;

import no.vindsiden.parser.WeatherDataParserFactory;
import no.vindsiden.parser.impl.support.WindUnitType;
import no.vindsiden.vindsiden.Measurement;

import com.google.common.collect.Lists;



/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public abstract class WeatherStation {
	
	private int weatherStationId;
	private String name;
	private boolean enabled;
	private String url;
	private WindUnitType windUnitType;
	
	
	public WeatherStation(int id, String name) {
		this.weatherStationId = id;
		this.name = name;
	}
	
	public List<Measurement> fetchMeasurement() throws IOException {
		return Lists.newArrayList(WeatherDataParserFactory.getInstance(this).fetchMeasurement());
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
}
