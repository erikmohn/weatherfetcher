package process;

import configuration.Configuration;

public class WeatherFetcherProcess {

	public static void main(String[] args) {
		new WeatherFetcher(Configuration.getConfiguration()).execute();
	}

}
