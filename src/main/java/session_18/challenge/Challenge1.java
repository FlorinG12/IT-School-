package session_18.challenge;

import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(21, 33, 4, 5, 2, 1, 56);
       List<Integer> sortNum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .toList();
        System.out.println(sortNum);
    }
}