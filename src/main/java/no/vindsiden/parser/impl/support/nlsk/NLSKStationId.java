package no.vindsiden.parser.impl.support.nlsk;

public enum NLSKStationId {
	Evjen(63,1), 
	Rye(64,2), 
	Orkanger(65,3),
	Grakallen(73,4);

	private NLSKStationId(int vindsidenId, int NLSKId) {
		this.vindsidenId = vindsidenId;
		this.NLSKId = NLSKId;
	}

	private int vindsidenId;
	private int NLSKId;

	public int getVindsidenId() {
		return vindsidenId;
	}

	public int getNLSKId() {
		return NLSKId;
	}

	public void setNLSKId(int nLSKId) {
		NLSKId = nLSKId;
	}

}
