package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class BackstagePass extends Product {

    private static String BACKSTAGE_PASS_NAME = "Backstage pass";

    public BackstagePass(int sellIn, int quality, LocalDate productionDate) {
        super(BACKSTAGE_PASS_NAME, sellIn, quality, productionDate);
    }

    @Override
    public long getTodayRemainingQuality() {
        return null;
    }
}