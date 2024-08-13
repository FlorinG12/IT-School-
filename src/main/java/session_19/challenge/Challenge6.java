package session_19.challenge;

import java.util.Arrays;

public class Challenge6 {

    public static void main(String[] args) {
        Integer[] number = {21, 22, 2, 4, 5, 6};

        int sum = Arrays.stream(number)
                .reduce(0, Integer::sum);
        System.out.println("The result is : " + sum);
    }
}