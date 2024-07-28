package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge5 {

    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Meat");

        List<String> newString = updatedList(shoppingList, 0, "Milk low fat");
        List<String> anotherString = updatedList(newString, 2, "Chicken meat");

        System.out.println(anotherString);
    }

    public static List<String> updatedList(List<String> list, int index, String value) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index ");
            return list;
        }
        List<String> updatedList = new ArrayList<>(list);
        updatedList.set(index, value);
        return updatedList;
    }
}