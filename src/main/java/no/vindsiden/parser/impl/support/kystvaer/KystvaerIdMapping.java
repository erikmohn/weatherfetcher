package no.vindsiden.parser.impl.support.kystvaer;

public enum KystvaerIdMapping {

    FAERDER(76,6895049),
    SVENNER(77,20029950),
    LISTA(78,20042160),
    GULLHOLMEN(79,20017280),
    VIKERTANGEN(80,8925059),
    HVASSER(81,6955059),
    VIGDEL(82,5265049);

    ;

    private int vindsidenId;
    private int kystvaerId;

    private KystvaerIdMapping(int vindSidenId, int kystvaerId) {
        this.vindsidenId = vindSidenId;
        this.kystvaerId = kystvaerId;
    }

    public int getVindsidenId() {
        return vindsidenId;
    }

    public int getKystvaerId() {
        return kystvaerId;
    }


}
