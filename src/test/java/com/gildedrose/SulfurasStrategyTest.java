package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SulfurasStrategyTest {
    @Test
    void testSulfurasNoChange() {
        Item item = new Item(ItemNames.SULFURAS, 80, 10);
        UpdateStrategy strategy = new SulfurasStrategy();
        strategy.update(item);
        assertEquals(80, item.quality);
        assertEquals(10, item.sellIn);
    }
}
