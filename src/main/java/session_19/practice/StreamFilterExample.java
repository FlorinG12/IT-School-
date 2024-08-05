package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Robin", "Jack", "Wiz", "Will");

        names.stream()
                .filter(name -> name.startsWith("W"))
                .forEach(name -> System.out.println(name));
    }
}