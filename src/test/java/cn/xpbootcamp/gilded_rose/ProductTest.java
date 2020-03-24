package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private static Product apple;
    private static Product cake;
    private static LocalDate today = LocalDate.now();

    @BeforeAll
    static void beforeAll() {
        apple = new Product("Apple", 7, 10, today.minusDays(3));
        cake = new Product("cake", 1, 35, today.minusDays(2));
    }

    @Test
    void assertQualityWhenGivenDateNotPassSellIn() {

    }

    @Test
    void assertLowestQualityWhenGivenQualityLessThenLowestQuality() {
        assertEquals(Product.LOWEST_QUALITY, apple.makeQualityValid(-1));
    }

    @Test
    void assertHighestQualityWhenGivenQualityBiggerThenHighestQuality() {
        assertEquals(Product.HIGHEST_QUALITY, apple.makeQualityValid(51));
    }

    @Test
    void assertMakeQualityValidWhenGivenQualityValid() {
        assertEquals(0, apple.makeQualityValid(0));
        assertEquals(50, apple.makeQualityValid(50));
        assertEquals(21, apple.makeQualityValid(21));
    }
}