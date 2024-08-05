package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class ComplexStreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Robin", "Jack", "Wiz", "Rick");

        //filter names that start with "R"
        //make uppercase all the names
        //sort names
        //collect the result in a new list

        List<String> result = names.stream()
                .filter(n -> n.startsWith("R"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(result);
    }
}