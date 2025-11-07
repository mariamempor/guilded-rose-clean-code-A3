package com.gildedrose;

public interface UpdateStrategy {
    default void update(Item item) {
        // Validação comum: qualidade entre 0 e 50 (exceto Sulfuras)
        if (item.quality < 0) item.quality = 0;
        if (item.quality > 50 && !item.name.equals(ItemNames.SULFURAS)) item.quality = 50;
    }
}
