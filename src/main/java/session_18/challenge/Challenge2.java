package session_18.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge2 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arnold", "Mark", "Jonson", "Bill", "Will");

        List<String> sortString = names.stream()
                .sorted()
                .toList();
        System.out.println(sortString);
    }
}