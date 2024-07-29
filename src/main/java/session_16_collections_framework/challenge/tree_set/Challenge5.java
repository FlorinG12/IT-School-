package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge5 {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(-12);
        numbers.add(21);
        numbers.add(311);
        numbers.add(-10);

        System.out.println("List of numbers : " + numbers);
        System.out.println("The first element from the list " + numbers.first());
        System.out.println("The last element from the list " + numbers.last());
    }
}