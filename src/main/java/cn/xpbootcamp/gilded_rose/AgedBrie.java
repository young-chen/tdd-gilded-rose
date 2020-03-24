package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class AgedBrie extends Product {

    private static String AGED_BRIE_NAME = "Aged Brie";

    public AgedBrie(int sellIn, int quality, LocalDate productionDate) {
        super(AGED_BRIE_NAME, sellIn, quality, productionDate);
    }

    @Override
    public long getTodayRemainingQuality() {
        int days = getDaysFromProductionDateToToday();
        long qualityNow = QualityCalculator.increaseQualityByBaseSpeedEachDay(quality, days);
        return makeQualityValid(qualityNow);
    }
}
