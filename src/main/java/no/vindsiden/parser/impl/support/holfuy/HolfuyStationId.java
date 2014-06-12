package no.vindsiden.parser.impl.support.holfuy;

public enum HolfuyStationId {
	s119(2119), 
	s124(2124),
	s108(2108),
	s112(2112),
	s118(2118),
	s107(2107);
	
	private Integer vindsidenId;
	
	private HolfuyStationId(Integer vindsidenId) {
		this.vindsidenId = vindsidenId;
	}

	public Integer getVindsidenId() {
		return vindsidenId;
	}
}
