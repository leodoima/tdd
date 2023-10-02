package main.cap3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    public final List<Item> listItems = new ArrayList<>();

    public double lowerValue() {
        double lowerValueInShoppingList = 0.0;

        for (Item i : listItems) {
            if (i.getValue() < lowerValueInShoppingList || lowerValueInShoppingList == 0.0) {
                lowerValueInShoppingList = i.getValue();
            }
        }

        return lowerValueInShoppingList;
    }

    public double highestValue() {
        double highestValueInShoppingList = 0.0;

        for (Item i : listItems) {
            if (i.getValue() > highestValueInShoppingList || highestValueInShoppingList == 0.0) {
                highestValueInShoppingList = i.getValue();
            }
        }

        return highestValueInShoppingList;
    }
}
