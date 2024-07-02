package session_9_arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Al");
        names.add("Charlie");
        names.add("Jack");
        names.add("Ben");

        boolean isListEmpty = names.isEmpty();
        System.out.println("Is list empty? " + isListEmpty);

        for (String name : names) {
            System.out.println(name + " ");
        }
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Watermelon"));
        System.out.println(fruits.contains("Apple"));
        String someFruit = fruits.get(2);
        System.out.println("What I like the most : " +someFruit);

        for (int index = 0; index < fruits.size();index++ ){
            System.out.println(fruits.get(index));
        }
    }
}
