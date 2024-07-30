package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;

public class Challenge3 {

    public static void main(String[] args) {
        HashMap<String, String> capitalName = new HashMap<>();
        capitalName.put("Romania", "Bucharest");
        capitalName.put("Germany", "Berlin");
        capitalName.put("Belgium", "Brussels");
        displayHashMap(capitalName);

        HashMap<String, String> anotherCapitalName = new HashMap<>();
        anotherCapitalName.putAll(capitalName);
        displayHashMap(anotherCapitalName);
    }

    public static void displayHashMap(HashMap<String, String> display) {
        for (String show : display.keySet()) {
            System.out.println("key: " + show + " value: " + display.get(show));
        }
    }
}