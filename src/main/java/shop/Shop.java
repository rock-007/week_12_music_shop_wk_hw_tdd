package shop;

import behaviours.ISell;

import java.util.HashMap;

public class Shop {
    HashMap<ISell, Integer> stocklevel;

    public Shop() {
        this.stocklevel = new HashMap<>();
    }

    public HashMap<ISell, Integer> getStocklevel() {
        return stocklevel;
    }

    public int currentStockQuantity(ISell stockItem) {
        return stocklevel.getOrDefault(stockItem, 0);
    }


    public void setStocklevel(ISell stockItem, int quantity) {
        this.stocklevel.put(stockItem, currentStockQuantity(stockItem) + quantity);
    }

    public void sellItemFromStock(ISell stockItem, int quantity) {
        if (currentStockQuantity(stockItem) == 1) {
            this.stocklevel.remove(stockItem);
        } else if (currentStockQuantity(stockItem) > 1) {
            this.stocklevel.put(stockItem, currentStockQuantity(stockItem) - 1);

        }
    }

}
