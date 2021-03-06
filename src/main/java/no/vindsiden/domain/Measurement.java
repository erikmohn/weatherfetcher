package no.vindsiden.domain;

import java.text.DecimalFormat;
import java.time.Instant;

import no.vindsiden.parser.impl.support.JodaTimeConverter;

import org.joda.time.DateTime;

import com.thoughtworks.xstream.XStream;

/**
 * @author Erik Mohn - mohn.erik@gmail.com
 */
public class Measurement {

	private int DataID;
	private int StationID;
	private DateTime Time;
	private Double WindAvg;
	private Double WindVectorAvg;
	private Double WindStDev;
	private Double WindMax;
	private Double windMin;
	private int DirectionAvg;
	private int DirectionVectorAvg;
	private Double DirectionStDev;
	private Double Temperature1;
	private Double Temperature2;
	private int Light;
	private Double Battery;
	private String stationName;
	private Instant timestamp;

	public int getDataID() {
		return DataID;
	}

	public void setDataID(int dataID) {
		DataID = dataID;
	}

	public int getStationID() {
		return StationID;
	}

	public void setStationID(int stationID) {
		StationID = stationID;
	}

	public DateTime getTime() {
		return Time;
	}

	public void setTime(DateTime time) {
		Time = time;
	}

	public Double getWindAvg() {
		return WindAvg;
	}

	public void setWindAvg(Double windAvg) {
		WindAvg = windAvg;
	}

	public Double getWindVectorAvg() {
		return WindVectorAvg;
	}

	public void setWindVectorAvg(Double windVectorAvg) {
		WindVectorAvg = windVectorAvg;
	}

	public Double getWindStDev() {
		return WindStDev;
	}

	public void setWindStDev(Double windStDev) {
		WindStDev = windStDev;
	}

	public Double getWindMax() {
		return WindMax;
	}

	public void setWindMax(Double windMax) {
		WindMax = windMax;
	}

	public Double getWindMin() {
		return windMin;
	}

	public void setWindMin(Double windMin) {
		this.windMin = windMin < 0 ? 0: windMin;
	}

	public int getDirectionAvg() {
		return DirectionAvg;
	}

	public void setDirectionAvg(int directionAvg) {
		DirectionAvg = directionAvg;
	}

	public int getDirectionVectorAvg() {
		return DirectionVectorAvg;
	}

	public void setDirectionVectorAvg(int directionVectorAvg) {
		DirectionVectorAvg = directionVectorAvg;
	}

	public Double getDirectionStDev() {
		return DirectionStDev;
	}

	public void setDirectionStDev(Double directionStDev) {
		DirectionStDev = directionStDev;
	}

	public Double getTemperature1() {
		return Temperature1;
	}

	public void setTemperature1(Double temperature1) {
		Temperature1 = temperature1;
	}

	public Double getTemperature2() {
		return Temperature2;
	}

	public void setTemperature2(Double temperature2) {
		Temperature2 = temperature2;
	}

	public int getLight() {
		return Light;
	}

	public void setLight(int light) {
		Light = light;
	}

	public Double getBattery() {
		return Battery;
	}

	public void setBattery(Double battery) {
		Battery = battery;
	}

	public String toXml() {
		XStream xs = new XStream();
		xs.alias("Measurement", Measurement.class);
		xs.registerConverter(new JodaTimeConverter());
		return xs.toXML(this);

	}

	public String toVindSidenUrl() {

		DecimalFormat df = new DecimalFormat("#.#");

		return "http://www.vindsiden.no/wrm.aspx" + "?v=0" + "&CC=314" + "&Id="
				+ getStationID() + "&Wind=" + df.format(getWindAvg())
				+ "&WindMin=" + df.format(getWindMin()) + "&WindMax="
				+ df.format(getWindMax()) + "&Dir=" + getDirectionAvg()
				+ "&Temp1=" + getTemperature1();
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}
}
