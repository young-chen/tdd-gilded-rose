package cn.xpbootcamp.gilded_rose;

import java.time.LocalDate;

public class Product {

    public static int LOWEST_QUALITY = 0;
    public static int HIGHEST_QUALITY = 50;

    protected String name;
    protected int sellIn;
    protected long quality;
    protected LocalDate productionDate;

    public Product(String name, int sellIn, int quality, LocalDate productionDate) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.productionDate = productionDate;
    }

    public long getTodayRemainingQuality() {
        int days = getDaysFromProductionDateToToday();
        long qualityNow;
        if (isPassSellInToday())
            qualityNow = QualityCalculator.reduceQualityByDoubleBaseSpeedEachDay(quality, days);
        else
            qualityNow = quality;
        return makeQualityValid(qualityNow);
    }

    public long makeQualityValid(long quality) {
        if (quality < LOWEST_QUALITY) {
            return this.quality = LOWEST_QUALITY;
        } else if (quality > HIGHEST_QUALITY) {
            return this.quality = HIGHEST_QUALITY;
        } else {
            return this.quality = quality;
        }
    }

    public int getDaysFromProductionDateToToday() {
        LocalDate today = LocalDate.now();
        return (int)(today.toEpochDay() - productionDate.toEpochDay());
    }

    public int getDaysFromTodayToSellIn() {
        LocalDate today = LocalDate.now();
        return (int)(productionDate.toEpochDay() + sellIn - today.toEpochDay());
    }

    public boolean isPassSellInToday() {
        LocalDate today = LocalDate.now();
        return productionDate.plusDays(sellIn).isBefore(today);
    }

    public long getQuality() {
        return quality;
    }
}
