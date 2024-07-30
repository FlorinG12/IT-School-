package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;

public class Challenge10 {

    public static void main(String[] args) {
        HashMap<Integer, String> capitalName = new HashMap<>();
        capitalName.put(1, "Bucharest");
        capitalName.put(2, "Berlin");
        capitalName.put(3, "Brussels");

        System.out.println(capitalName.get(1));
    }
}