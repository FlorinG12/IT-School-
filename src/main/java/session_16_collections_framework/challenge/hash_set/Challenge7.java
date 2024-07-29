package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Challenge7 {

    public static void main(String[] args) {
        HashSet<String> fruitList = new HashSet<>();
        fruitList.add("watermelon");
        fruitList.add("strawberry");
        fruitList.add("melon");

        System.out.println("This is an hashSet");
        displayHashSetElement(fruitList);

        String[] array = fruitList.toArray(new String[0]);
        System.out.println("This is an array");
        displayArrayElement(array);
    }

    public static void displayHashSetElement(HashSet<String> mySet) {
        for (String hashSet : mySet) {
            System.out.println(hashSet + " ");
        }
    }

    public static void displayArrayElement(String[] array) {
        for (String displayArray : array) {
            System.out.println(displayArray + " ");
        }
    }
}