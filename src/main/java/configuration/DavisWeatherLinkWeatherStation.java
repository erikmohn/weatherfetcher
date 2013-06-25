package configuration;

import parser.DavisWeatherLinkDataParser;

public class DavisWeatherLinkWeatherStation extends WeatherStation<DavisWeatherLinkDataParser> {
	
	private String davisWeatherLinkUrl;
	
	public DavisWeatherLinkWeatherStation(int id, String url) {
		super(id);
		davisWeatherLinkUrl = url;
	}
	
	@Override
	public DavisWeatherLinkDataParser initParser(WeatherStation weatherStation) {
		return new DavisWeatherLinkDataParser(weatherStation);
	}

	public void setDavisWeatherLinkUrl(String davisWeatherLinkUrl) {
		this.davisWeatherLinkUrl = davisWeatherLinkUrl;
	}

	public String getDavisWeatherLinkUrl() {
		return davisWeatherLinkUrl;
	}
}
