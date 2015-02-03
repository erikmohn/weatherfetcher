package no.vindsiden.parser.impl.support.holfuy;

public enum HolfuyStationId {
	s119(2119),
	s124(2124),
	s121(2121),
	s109(2109),
	s112(2112),
	s118(2118),
	s107(2107),
	s133(2133),
	s134(2134),
	s135(2135),
	s142(2145),
	s158(2158),
	s174(2174);
	
	private Integer vindsidenId;
	
	private HolfuyStationId(Integer vindsidenId) {
		this.vindsidenId = vindsidenId;
	}

	public Integer getVindsidenId() {
		return vindsidenId;
	}
}
