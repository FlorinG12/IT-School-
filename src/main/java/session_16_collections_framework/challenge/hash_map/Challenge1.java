package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;

public class Challenge1 {

    public static void main(String[] args) {
        HashMap<String, String> capitalNames = new HashMap<>();
        capitalNames.put("Romania", "Bucharest");
        capitalNames.put("Germany", "Berlin");
        capitalNames.put("Belgium", "Brussels");
        displayHashMap(capitalNames);
    }

    public static void displayHashMap(HashMap<String, String> display) {
        for (String show : display.keySet()) {
            System.out.println("key: " + show + " value: " + display.get(show));
        }
    }
}