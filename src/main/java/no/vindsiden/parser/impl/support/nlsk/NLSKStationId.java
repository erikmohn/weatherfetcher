package no.vindsiden.parser.impl.support.nlsk;

public enum NLSKStationId {
	Evjen(63), 
	Rye(64), 
	Orkanger(65);

	private NLSKStationId(int vindsidenId) {
		this.vindsidenId = vindsidenId;
	}

	private int vindsidenId;

	public int getVindsidenId() {
		return vindsidenId;
	}

}
