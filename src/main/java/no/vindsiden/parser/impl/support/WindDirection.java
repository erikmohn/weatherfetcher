package no.vindsiden.parser.impl.support;

public enum WindDirection {
	N	(0,"N"),
	NNE	(23,"NNØ"),
	NE	(45, "NØ"),
	ENE	(68, "ENØ"),
	E	(90, "Ø"),
	ESE	(113, "ØSØ"),
	SE	(135, "SØ"),
	SSE	(153, "SSØ"),
	S	(180, "S"),
	SSW	(203, "SSV"),
	SW	(225, "SV"),
	WSW	(248,"VSV"),
	W	(270, "V"),
	WNW	(293,"VNV"),
	NW	(315, "NV"),
	NNW	(338, "NNV");
	
	private WindDirection(int degree, String norwegianName) {
		this.norwegianName = norwegianName;
		this.degree = degree;
	}
	
	String norwegianName;
	int degree;
	
	public static int getWindDirectionFromString(String text) {
		WindDirection result = null;
		for (WindDirection windDirection : WindDirection.class.getEnumConstants()) {
			if (windDirection.norwegianName.equals(text)) {
				result = windDirection;
				break;
			}
		}
		return result.degree;
	}
}
