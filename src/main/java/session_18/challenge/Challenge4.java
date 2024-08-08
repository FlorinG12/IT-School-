package session_18.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge4 {

    public static void main(String[] args) {
        List<String> carName = Arrays.asList("Tesla", "Bmw", "Kia", "Ferrari", "Mustang");

        String sort = carName.stream()
                .sorted()
                .toList()
                .toString();
        System.out.println(sort);

        String sortReverse = carName.stream()
                .sorted(Collections.reverseOrder())
                .toList()
                .toString();
        System.out.println(sortReverse);
    }
}