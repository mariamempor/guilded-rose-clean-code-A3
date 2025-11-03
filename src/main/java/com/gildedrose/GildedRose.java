package com.gildedrose;

import java.util.List;

public class GildedRose {
    private final List<Item> items;

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdateStrategy strategy = ItemStrategyFactory.createStrategy(item.name);
            strategy.update(item);
        }
    }
}