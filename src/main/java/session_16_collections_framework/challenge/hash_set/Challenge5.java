package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Challenge5 {

    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();
        number.add(22);
        number.add(12);
        number.add(32);
        number.add(21);

        if (number.isEmpty()) {
            System.out.println("No elements in the HashSet");
        } else {
            System.out.println("Number of elements " + number.size());
        }
    }
}