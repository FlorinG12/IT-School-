package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge11 {

    public static void main(String[] args) {

        TreeSet<Integer> number = new TreeSet<>();
        number.add(12);
        number.add(2);
        number.add(5);
        number.add(7);
        number.add(100);

        TreeSet<Integer> number1 = new TreeSet<>(number.descendingSet());
        System.out.println(number1.tailSet(12));
    }
}