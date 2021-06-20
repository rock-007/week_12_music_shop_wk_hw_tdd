package shop;

import behaviours.ISell;
import equipments.playingInstruments.Gitar;
import equipments.playingInstruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoptTest {
    ISell gitar;
    Shop shop;

    @Before

    public void before() {
        gitar = new Gitar("StellGitar", 55, 65, InstrumentType.GITARCLASSIC.getName(), "Brown");
        shop = new Shop();
    }


    @Test
    public void addInstrumentToShop() {
        shop.setStocklevel(gitar, 5);
        assertEquals(5, shop.currentStockQuantity(gitar));
    }


}
