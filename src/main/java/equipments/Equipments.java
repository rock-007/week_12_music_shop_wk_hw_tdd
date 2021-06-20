package equipments;

import behaviours.ISell;

public class Equipments implements ISell {
    private String name;
    private int buyingPrice;
    private int sellingPrice;

    public Equipments(String name, int buyingPrice, int sellingPrice) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }


    @Override
    public double calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }
}
