package session_18.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 44, 2, 3,22,33);

        Integer sumOfNumbers = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of this list:" + numbers + " is = " + sumOfNumbers);
    }
}