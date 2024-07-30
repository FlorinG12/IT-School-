package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;

public class Challenge2 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(12, -12);
        numbers.put(15, -15);
        numbers.put(34, -34);
        numbers.put(25, -25);

        System.out.println(numbers.size());
    }
}