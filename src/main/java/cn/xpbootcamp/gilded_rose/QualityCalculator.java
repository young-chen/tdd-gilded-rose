package cn.xpbootcamp.gilded_rose;

public class QualityCalculator {
    private static long BASE_REDUCE_SPEED = 1;
    private static long BASE_INCREASE_SPEED = 1;

    public static long reduceQualityByBaseSpeedEachDay(long quality, int days) {
        return quality - BASE_REDUCE_SPEED * days;
    }

    public static long reduceQualityByDoubleBaseSpeedEachDay(long quality, int days) {
        return quality - 2 * BASE_REDUCE_SPEED * days;
    }

    public static long increaseQualityByBaseSpeedEachDay(long quality, int days) {
        return quality + BASE_INCREASE_SPEED * days;
    }

    public static long increaseQualityEachDayByStep(long quality, int days, int step) {
        return quality + (step + BASE_INCREASE_SPEED) * days;
    }
}
