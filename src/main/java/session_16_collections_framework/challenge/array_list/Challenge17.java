package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge17 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < 12; index++) {
            numbers.add(index);
        }
        System.out.println(numbers.size());

        numbers.clear();
        System.out.println(numbers.size());
    }
}