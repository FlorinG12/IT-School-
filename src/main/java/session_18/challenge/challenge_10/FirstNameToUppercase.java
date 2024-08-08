package session_18.challenge.challenge_10;

import java.util.Arrays;
import java.util.List;

public class FirstNameToUppercase {

    public static void main(String[] args) {
        List<String> firstName = Arrays.asList("Loren", "Aragon", "sam");

        FirstNameList toUppercase = name -> name.stream()
                .map(String::toUpperCase)
                .toList();

        List<String> result = toUppercase.nameToUppercase(firstName);
        System.out.println(result);
    }
}