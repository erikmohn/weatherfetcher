package process;
import vindsiden.Measurement;
import vindsiden.VindsidenHttpClient;
import configuration.Configuration;
import configuration.WeatherStation;

public class WeatherFetcher {

	private VindsidenHttpClient httpClient;
	private Configuration configuration;
	
	public WeatherFetcher(Configuration config) {
			this.httpClient = new VindsidenHttpClient();
			this.configuration = config;
	}
	
	public void execute() throws Exception {	
		for (WeatherStation ws : configuration.getWeatherStationList()) {
			Measurement measurement = ws.fetchMeasurement();
			httpClient.sendHttpRequest(measurement);
			log("Executed HTTP request: " + measurement.toVindSidenUrl());				
		}		
	}

	public void setHttpClient(VindsidenHttpClient httpClient) {
		this.httpClient = httpClient;
	}
	
	protected void log(String log) {
		System.out.println(log);
	}
	
}
