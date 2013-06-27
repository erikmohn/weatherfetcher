package configuration;

import java.io.IOException;

import parser.WeatherDataParser;
import parser.WeatherDataParserFactory;

import vindsiden.Measurement;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public abstract class WeatherStation<PARSER extends WeatherDataParser> {
	
	private Class<PARSER> parserClass;
	private PARSER dataParser;
	private int weatherStationId;
	
	
	public Class<PARSER> getParserClass() {
		return parserClass;
	}
	
	public WeatherStation(int id, Class<PARSER> clazz) {
		this.parserClass = clazz;
		weatherStationId = id;
	}
	
	@SuppressWarnings("unchecked")
	public Measurement fetchMeasurement() throws IOException {
		dataParser = (PARSER) WeatherDataParserFactory.getInstance(this);
		return dataParser.fetchMeasurement();
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
}
