package com.gildedrose;

public class ItemStrategyFactory {
    public static UpdateStrategy createStrategy(String name) {
        switch (name) {
            case ItemNames.AGED_BRIE:
                return new AgedBrieStrategy();
            case ItemNames.BACKSTAGE_PASSES:
                return new BackstagePassesStrategy();
            case ItemNames.SULFURAS:
                return new SulfurasStrategy();
            default:
                return new NormalItemStrategy();
        }
    }
}