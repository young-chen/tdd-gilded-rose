package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class Sulfuras extends Product {

    private static String SULFURAS_NAME = "Sulfuras";

    public Sulfuras(int sellIn, int quality, LocalDate productionDate) {
        super(SULFURAS_NAME, sellIn, quality, productionDate);
    }

    @Override
    public long getTodayRemainingQuality() {
         return quality;
    }
}
