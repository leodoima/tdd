package main.cap3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    private ShoppingListBuilder shoppingListBuilder;

    private List<Item> newItens;

    @BeforeEach
    public void init() {
        this.shoppingListBuilder = new ShoppingListBuilder();
        this.newItens = Arrays.asList(new Item("Livro 1", 35.0), new Item("Livro 2", 75.0), new Item("Livro 3", 25.0));
    }

    @Test
    public void shouldTrueForEmptyList() {
        assertTrue(this.shoppingListBuilder.getShoppingList().listItems.isEmpty());
    }

    @Test
    @DisplayName("Teste de menor valor contido no carrinho de compras")
    public void shouldLessValueIntoShoppingList() {
        this.shoppingListBuilder.addList(newItens);
        assertEquals(25.0, this.shoppingListBuilder.getShoppingList().lowerValue());
    }

    @Test
    @DisplayName("Teste de maior valor contido no carrinho de compras")
    public void shouldHighestValueIntoShoppingList() {
        this.shoppingListBuilder.addList(newItens);
        assertEquals(75.0, this.shoppingListBuilder.getShoppingList().highestValue());
    }
}