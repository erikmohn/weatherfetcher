package no.vindsiden.parser.impl.support;

public enum DavisDescription {

	AVG_WIND_SPEED(1),
	AVG_WIND_SPEED_10_MINUTES(158),
	GUSTS(2),
	TEMP(4),
	WIND_DIRECTION(3);
	
	int index;
	
	private DavisDescription(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
}
