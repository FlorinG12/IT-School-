package session_16_collections_framework.challenge.array_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge8 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Orange", "Apple", "Watermelon", "Cherry");

        Collections.sort(fruits);
        System.out.println(fruits);
    }
}