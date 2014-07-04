package no.vindsiden;

import no.vindsiden.configuration.Configuration;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class WeatherFetcherProcess {

	public static void main(String[] args) {
		new WeatherFetcher(Configuration.getConfiguration()).execute();
	}

}
