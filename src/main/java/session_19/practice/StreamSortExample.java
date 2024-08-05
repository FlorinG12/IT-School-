package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class StreamSortExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Robin", "Jack", "Wiz", "Arnold");

        names.stream()
                .sorted()
                .forEach(System.out::println);
    }
}