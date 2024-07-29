package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Challenge6 {

    public static void main(String[] args) {
        HashSet<String> listName = new HashSet<>();
        listName.add("Matteo");
        listName.add("Kevin");
        listName.add("Robert");

        HashSet<String> anotherListName = new HashSet<>();
        anotherListName.addAll(listName);
        System.out.println(anotherListName);
    }
}