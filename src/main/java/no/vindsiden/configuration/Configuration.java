package no.vindsiden.configuration;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;







import no.vindsiden.domain.WeatherStation;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;


/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
@XStreamAlias("configuration")
public class Configuration {

	private static Configuration configurationCache;
	private String vindSidenUrl;
	@XStreamImplicit
	private List<WeatherStation> weatherStationList;
	private long timeToSleepBeforeErrorHandling;

	public void addWeatherStation(WeatherStation weatherStation) {
		if (weatherStationList == null) {
			this.weatherStationList = new ArrayList<WeatherStation>();
		}
		weatherStationList.add(weatherStation);
	}

	public List<WeatherStation> getWeatherStationList() {
		return weatherStationList;
	}

	public void setVindSidenUrl(String vindSidenUrl) {
		this.vindSidenUrl = vindSidenUrl;
	}

	public String getVindSidenUrl() {
		return vindSidenUrl;
	}
	
	public static Configuration getConfiguration() {
		if (configurationCache == null) {
			InputStream is = ClassLoader.getSystemResourceAsStream("configuration.xml");
			XStream xStream = new XStream();
			xStream.processAnnotations(Configuration.class);
			configurationCache = (Configuration) xStream.fromXML(is);
		}
		return configurationCache;
	}

	public void setTimeToSleepBeforeErrorHandling(long timeToSleepBeforeErrorHandling) {
		this.timeToSleepBeforeErrorHandling = timeToSleepBeforeErrorHandling;
	}

	public long getTimeToSleepBeforeErrorHandling() {
		return timeToSleepBeforeErrorHandling;
	}
	
	public void clearWeatherStations() {
		weatherStationList.clear();
	}
	
}
