package com.gildedrose;

import java.util.List;

public class GildedRose {
    private final List<Item> items;

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals(ItemNames.AGED_BRIE)) {
                if (item.quality < 50) {
                    item.quality++;
                }
                item.sellIn--;
                if (item.sellIn < 0 && item.quality < 50) {
                    item.quality++;
                }
            } else if (item.name.equals(ItemNames.BACKSTAGE_PASSES)) {
                if (item.quality < 50) {
                    item.quality++;
                    if (item.sellIn < 11 && item.quality < 50) {
                        item.quality++;
                    }
                    if (item.sellIn < 6 && item.quality < 50) {
                        item.quality++;
                    }
                }
                item.sellIn--;
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
            } else if (item.name.equals(ItemNames.SULFURAS)) {
                // Sulfuras não muda
            } else {
                if (item.quality > 0) {
                    item.quality--;
                }
                item.sellIn--;
                if (item.sellIn < 0 && item.quality > 0) {
                    item.quality--;
                }
            }
        }
    }
}