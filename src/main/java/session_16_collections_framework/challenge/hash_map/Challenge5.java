package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;

public class Challenge5 {

    public static void main(String[] args) {
        HashMap<String, String> capitalNames = new HashMap<>();
//        capitalNames.put("Romania", "Bucharest");
//        capitalNames.put("Germany", "Berlin");
//        capitalNames.put("Belgium", "Brussels");

        checkMethodHashMap(capitalNames);
    }

    public static void checkMethodHashMap(HashMap<String, String> map) {
        if (map.isEmpty()) {
            System.out.println("HashMap is empty");
        } else {
            System.out.println("Hash map has " + map.size() + " elements");
        }
    }
}