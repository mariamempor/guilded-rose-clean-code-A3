package com.gildedrose;
/**
* Interface para estratégias de atualização de itens.
* Permite extensibilidade sem modificar código existente.
*/
public interface UpdateStrategy {
void update(Item item);
}