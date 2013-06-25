package configuration;

import java.io.IOException;

import parser.WeatherDataParser;

import vindsiden.Measurement;



public abstract class WeatherStation<PARSER extends WeatherDataParser<?>> {
	
	private PARSER dataParser;
	private int weatherStationId;
	
	public WeatherStation(int id) {
		weatherStationId = id;
		dataParser = initParser(this);
	}
	
	public abstract PARSER initParser(WeatherStation<?> weatherStation);
	
	public Measurement fetchMeasurement() throws IOException {
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
