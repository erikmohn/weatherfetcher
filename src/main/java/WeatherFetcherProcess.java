public class WeatherFetcherProcess {

	public static void main(String[] args) {
			try {
				new WeatherFetcher().execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
