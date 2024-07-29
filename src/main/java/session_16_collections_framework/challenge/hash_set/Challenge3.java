package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Challenge3 {

    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();
        number.add(22);
        number.add(12);
        number.add(32);
        number.add(21);

        System.out.println("We have " + number.size() + " elements in this HashSet");
    }
}