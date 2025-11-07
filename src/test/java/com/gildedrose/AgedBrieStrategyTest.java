package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgedBrieStrategyTest {
    @Test
    void testAgedBrieBeforeSellIn() {
        Item item = new Item(ItemNames.AGED_BRIE, 10, 20);
        UpdateStrategy strategy = new AgedBrieStrategy();
        strategy.update(item);
        assertEquals(11, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    void testAgedBrieAfterSellIn() {
        Item item = new Item(ItemNames.AGED_BRIE, 0, 0);
        UpdateStrategy strategy = new AgedBrieStrategy();
        strategy.update(item);
        assertEquals(2, item.quality);
        assertEquals(-1, item.sellIn);
    }
}
