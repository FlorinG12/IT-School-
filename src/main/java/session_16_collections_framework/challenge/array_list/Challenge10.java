package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge10 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(14);
        numbers.add(22);
        numbers.add(-10);

        Collections.shuffle(numbers);
        System.out.println(numbers);
    }
}