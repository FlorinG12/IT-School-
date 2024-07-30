package session_16_collections_framework.challenge.tree_map;

import java.util.TreeMap;

public class Challenge5 {

    public static void main(String[] args) {
        TreeMap<Integer, String> name = new TreeMap<>();
        name.put(1, "Roberto");
        name.put(2, "Mike");
        name.put(3, "David");

        System.out.println(name.keySet());
    }
}