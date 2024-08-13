package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge10 {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Java Streams", "Method reference", "Lambda Expresion");

        int totalCharacter = str.stream()
                .flatMapToInt(String::chars)
                .filter(c -> !Character.isWhitespace(c))
                .map(c -> 1)
                .sum();
        System.out.println("Total characters in the sentence : " + totalCharacter);
    }
}