package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 51, 21, 22, 12, 6, 9, 44);

        List<Integer> evenNumber = number.stream()
                .sorted()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("List : " + number);
        System.out.println("Even Numbers from the list : " + evenNumber);
    }
}