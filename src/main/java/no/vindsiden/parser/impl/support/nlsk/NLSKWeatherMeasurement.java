package no.vindsiden.parser.impl.support.nlsk;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("stasjon")
public class NLSKWeatherMeasurement {
	@XStreamAsAttribute
	private int id;
	@XStreamAsAttribute
	private String navn;
	@XStreamAsAttribute
	private double vindstyrke;
	@XStreamAsAttribute
	private int vindretning;
	@XStreamAsAttribute
	private double trykk;
	@XStreamAsAttribute
	private double temperatur;
	@XStreamAsAttribute
	private double fukt;
	@XStreamAsAttribute
	private double snitt15;
	@XStreamAsAttribute
	private double max15;
	@XStreamAsAttribute
	private double min15;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public double getVindstyrke() {
		return vindstyrke;
	}
	public void setVindstyrke(double vindstyrke) {
		this.vindstyrke = vindstyrke;
	}
	public int getVindretning() {
		return vindretning;
	}
	public void setVindretning(int vindretning) {
		this.vindretning = vindretning;
	}
	public double getTrykk() {
		return trykk;
	}
	public void setTrykk(double trykk) {
		this.trykk = trykk;
	}
	public double getTemperatur() {
		return temperatur;
	}
	public void setTemperatur(double temperatur) {
		this.temperatur = temperatur;
	}
	public double getFukt() {
		return fukt;
	}
	public void setFukt(double fukt) {
		this.fukt = fukt;
	}
	public double getSnitt15() {
		return snitt15;
	}
	public void setSnitt15(double snitt15) {
		this.snitt15 = snitt15;
	}
	public double getMax15() {
		return max15;
	}
	public void setMax15(double max15) {
		this.max15 = max15;
	}
	public double getMin15() {
		return min15;
	}
	public void setMin15(double min15) {
		this.min15 = min15;
	}
	
	
}
