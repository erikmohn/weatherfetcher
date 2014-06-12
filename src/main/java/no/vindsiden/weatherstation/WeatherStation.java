package no.vindsiden.weatherstation;

import java.io.IOException;
import java.util.List;

import com.google.common.collect.Lists;

import no.vindsiden.parser.WeatherDataParser;
import no.vindsiden.parser.WeatherDataParserFactory;
import no.vindsiden.vindsiden.Measurement;



/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public abstract class WeatherStation<PARSER extends WeatherDataParser> {
	
	private Class<PARSER> parserClass;
	private PARSER dataParser;
	private int weatherStationId;
	private String name;
	private boolean enabled;
	private String url;
	
	
	public Class<PARSER> getParserClass() {
		return parserClass;
	}
	
	public WeatherStation(int id, Class<PARSER> clazz, String name) {
		this.parserClass = clazz;
		this.weatherStationId = id;
		this.name = name;
	}
	
	@SuppressWarnings("unchecked")
	public List<Measurement> fetchMeasurement() throws IOException {
		dataParser = (PARSER) WeatherDataParserFactory.getInstance(this);
		return Lists.newArrayList(dataParser.fetchMeasurement());
	}
	
	public void setWeatherStationId(int weatherStationId) {
		this.weatherStationId = weatherStationId;
	}

	public int getWeatherStationId() {
		return weatherStationId;
	}

	public void setDataParser(PARSER dataParser) {
		this.dataParser = dataParser;
	}

	public PARSER getDataParser() {
		return dataParser;
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
}
