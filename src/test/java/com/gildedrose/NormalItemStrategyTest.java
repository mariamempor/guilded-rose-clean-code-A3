package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NormalItemStrategyTest {
    @Test
    void testNormalItemBeforeSellIn() {
        Item item = new Item("Normal Item", 10, 20);
        UpdateStrategy strategy = new NormalItemStrategy();
        strategy.update(item);
        assertEquals(9, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    void testNormalItemAfterSellIn() {
        Item item = new Item("Normal Item", 0, 20);
        UpdateStrategy strategy = new NormalItemStrategy();
        strategy.update(item);
        assertEquals(18, item.quality);
        assertEquals(-1, item.sellIn);
    }
}
