package session_16_collections_framework.challenge.linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class Challenge16 {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(23);
        numbers.add(21);
        numbers.add(12);
        numbers.add(-5);
        numbers.add(-15);

        Collections.shuffle(numbers);
        System.out.println(numbers);
    }
}