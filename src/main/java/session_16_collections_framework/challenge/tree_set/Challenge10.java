package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge10 {

    public static void main(String[] args) {
        TreeSet<Integer> number = new TreeSet<>();
        number.add(12);
        number.add(2);
        number.add(5);
        number.add(7);
        number.add(25);

        System.out.println(number.tailSet(12));
    }
}