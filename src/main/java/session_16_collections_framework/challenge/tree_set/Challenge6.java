package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge6 {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(22);
        numbers.add(12);
        numbers.add(15);

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.addAll(numbers);
        System.out.println(numbers2);
    }
}