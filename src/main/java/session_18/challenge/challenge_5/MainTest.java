package session_18.challenge.challenge_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 1, 6, 2, 22);
        List<Integer> emptyList = List.of();

        FindMaxInteger findMaxInteger = number -> {
            if (number == null || number.isEmpty()) {
                return null;
            }
            return Collections.max(number);
        };
        System.out.println("Max value in a list with numbers : " + findMaxInteger.maxValue(numbersList));
        System.out.println("Max value in a list empty : " + findMaxInteger.maxValue(emptyList));
    }
}