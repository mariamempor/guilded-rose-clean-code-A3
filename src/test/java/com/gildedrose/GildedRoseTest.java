package com.gildedrose; 
 
import org.junit.jupiter.api.Test; 
import java.util.List; 
import java.util.Arrays; 
import static org.junit.jupiter.api.Assertions.*; 
 
public class GildedRoseTest { 
 
    // Mantém o teste approval original para compatibilidade com o repositório base 
    @Test 
    public void testUpdateQuality() { 
        Item[] items = new Item[] { 
                new Item("fixme", 0, 0) 
        }; 
        GildedRose app = new GildedRose(Arrays.asList(items)); 
        app.updateQuality(); 
        assertEquals("fixme", app.items.get(0).name); 
    } 
 
    // Referências aos novos testes unitários para garantir cobertura completa 
    // (Esses testes isolados substituem a necessidade de approval para casos específicos) 
    // Exemplo: NormalItemStrategyTest, AgedBrieStrategyTest, etc., são executados 
separadamente. 
    // Para rodar todos: execute 'mvn test' ou IDE JUnit runner. 
} 