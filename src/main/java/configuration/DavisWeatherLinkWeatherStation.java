package configuration;

import parser.DavisWeatherLinkDataParser;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class DavisWeatherLinkWeatherStation extends WeatherStation<DavisWeatherLinkDataParser> {
	
	private String davisWeatherLinkUrl;
	
	public DavisWeatherLinkWeatherStation(int id, String url) {
		super(id, DavisWeatherLinkDataParser.class);
		davisWeatherLinkUrl = url;
	}

	public void setDavisWeatherLinkUrl(String davisWeatherLinkUrl) {
		this.davisWeatherLinkUrl = davisWeatherLinkUrl;
	}

	public String getDavisWeatherLinkUrl() {
		return davisWeatherLinkUrl;
	}
}
