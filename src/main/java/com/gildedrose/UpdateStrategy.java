package com.gildedrose;
/**
* Interface para estratégias de atualização de itens.
*/
public interface UpdateStrategy {
void update(Item item);
}
// Garante que qualidade fique entre 0 e 50, exceto para Sulfuras