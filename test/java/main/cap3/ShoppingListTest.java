package main.cap3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    @Test
    @DisplayName("Teste de menor valor contido no carrinho de compras")
    public void shouldLessValueIntoShoppingList() {
        Item i1 = new Item("Livro 1", 35.0);
        Item i2 = new Item("Livro 2", 75.0);
        Item i3 = new Item("Livro 3", 25.0);

        ShoppingList shopping = new ShoppingList();
        shopping.shoppingList.add(i1);
        shopping.shoppingList.add(i2);
        shopping.shoppingList.add(i3);

        assertEquals(25.0, shopping.lowerValue());
    }

    @Test
    @DisplayName("Teste de maior valor contido no carrinho de compras")
    public void shouldHighestValueIntoShoppingList(){
        Item i1 = new Item("Livro 1", 35.0);
        Item i2 = new Item("Livro 2", 75.0);
        Item i3 = new Item("Livro 3", 25.0);

        ShoppingList shopping = new ShoppingList();
        shopping.shoppingList.add(i1);
        shopping.shoppingList.add(i2);
        shopping.shoppingList.add(i3);

        assertEquals(75.0, shopping.highestValue());
    }
}