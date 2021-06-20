package equipments.playingInstruments;

public enum InstrumentType {


    GITARCLASSIC("CLASSIC GITAR"),
    GITARSTEELSTRING("STEEL-STRING GITAR"),
    TRUMPETLONG("LONG TRUMPET"),
    TRUMPETC("C TRUMPET");

    String name;

    InstrumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
