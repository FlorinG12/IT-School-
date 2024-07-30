package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;

public class Challenge4 {

    public static void main(String[] args) {
        HashMap<String, String> capitalName = new HashMap<>();
        capitalName.put("Romania", "Bucharest");
        capitalName.put("Germany", "Berlin");
        capitalName.put("Belgium", "Brussels");

        System.out.println("Elements inside the HashMap " + capitalName);
        capitalName.clear();
        System.out.println("Elements inside the HashMap " + capitalName);
    }
}