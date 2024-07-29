package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge9 {

    public static void main(String[] args) {
        TreeSet<Integer> number = new TreeSet<>();
        number.add(12);
        number.add(2);
        number.add(5);
        number.add(7);

        System.out.println(number.subSet(0,7));
    }
}