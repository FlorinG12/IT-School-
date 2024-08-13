package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge9 {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello coder", "Are you a junior developer?", "Do you like java?");

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .toList();

        Map<String, Long> wordFrequencies = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String repetitiveWord = wordFrequencies.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("The repetitive word is : " + repetitiveWord );
    }
}