package no.vindsiden.parser.impl.support.vegvesen;

public enum VegvesenStationId {

	Dyranut("505"),
	Eldrevann("65");
	
	private VegvesenStationId(String vegvesenId) {
		this.vegvesenId = vegvesenId;
	}

	private String vegvesenId;

	public String getVindsidenId() {
		return vegvesenId;
	}
}
