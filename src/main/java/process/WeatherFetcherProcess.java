package process;

import java.io.InputStream;

import com.thoughtworks.xstream.XStream;

import configuration.Configuration;

public class WeatherFetcherProcess {

	public static void main(String[] args) {
			try {
				XStream xs = new XStream();
				InputStream is = ClassLoader.getSystemResourceAsStream("configuration.xml");
				Configuration config = (Configuration) xs.fromXML(is);
				
				new WeatherFetcher(config).execute();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
