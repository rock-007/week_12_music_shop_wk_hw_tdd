package equipments.playingInstruments;

public class Gitar extends PlayingInstruments {

    public String type;
    public String color;


    public Gitar(String name, int buyingPrice, int sellingPrice, String type, String color) {
        super(name, buyingPrice, sellingPrice, type, color);
        this.type = type;
        this.color = color;
    }
}
