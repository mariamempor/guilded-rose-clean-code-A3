package com.gildedrose;
import java.util.List;
/**
* Classe principal para atualizar a qualidade dos itens da loja Gilded Rose.
* Usa Strategy Pattern para delegar comportamentos específicos.
*/
public class GildedRose {
private final List<Item> items;
public GildedRose(List<Item> items) {
this.items = items;
}
/**
* Atualiza a qualidade e sellIn de todos os itens.
*/
public void updateQuality() {
for (Item item : items) {
UpdateStrategy strategy = ItemStrategyFactory.createStrategy(item.name);
strategy.update(item);
}
}
}
