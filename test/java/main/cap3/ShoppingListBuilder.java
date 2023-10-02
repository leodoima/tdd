package main.cap3;

import java.util.List;

public class ShoppingListBuilder {

    private ShoppingList shoppingList;

    public ShoppingListBuilder() {
        this.shoppingList = new ShoppingList();
    }

    public void addList(List<Item> listItens) {
        for (Item item : listItens) {
            this.shoppingList.listItems.add(item);
        }
    }

    public ShoppingList getShoppingList() {
        return this.shoppingList;
    }
}
