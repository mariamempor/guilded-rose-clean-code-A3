package com.gildedrose; 
 
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 
 
public class BackstagePassesStrategyTest { 
    @Test 
    void testBackstagePassesMoreThan10Days() { 
        Item item = new Item(ItemNames.BACKSTAGE_PASSES, 10, 15); 
        UpdateStrategy strategy = new BackstagePassesStrategy(); 
        strategy.update(item); 
        assertEquals(11, item.quality); 
        assertEquals(14, item.sellIn); 
    } 
 
    @Test 
    void testBackstagePassesAfterSellIn() { 
        Item item = new Item(ItemNames.BACKSTAGE_PASSES, 10, 0); 
        UpdateStrategy strategy = new BackstagePassesStrategy(); 
        strategy.update(item); 
        assertEquals(0, item.quality); 
        assertEquals(-1, item.sellIn); 
    } 
}