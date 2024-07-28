package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Challenge1 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("first");
        hashSet.add("second");
        hashSet.add("last");

        System.out.println(hashSet);
    }
}