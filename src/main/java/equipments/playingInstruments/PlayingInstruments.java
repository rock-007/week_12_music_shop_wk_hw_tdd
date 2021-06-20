package equipments.playingInstruments;

import behaviours.IPlay;
import equipments.Equipments;

public class PlayingInstruments extends Equipments implements IPlay {

    private String type;
    private String color;

    public PlayingInstruments(String name, int buyingPrice, int sellingPrice, String type, String color) {
        super(name, buyingPrice, sellingPrice);
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String play() {
        return "The Instrument will play"+ this.type;
    }
}
