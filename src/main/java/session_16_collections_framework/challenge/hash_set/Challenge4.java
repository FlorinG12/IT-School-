package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Challenge4 {

    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
    }
}