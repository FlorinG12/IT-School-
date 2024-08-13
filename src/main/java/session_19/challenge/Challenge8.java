package session_19.challenge;

public class Challenge8 {

    public static void main(String[] args) {
        String sentence = "Welcome to my code ";
        long vowelCount = sentence.toLowerCase().chars()
                .filter(v -> isVowel((char) v))
                .count();
        System.out.println("Number of vowels in this sentence is  : " + vowelCount);
    }

    public static boolean isVowel(char v) {
        return "aeiou".indexOf(v) != -1;
    }
}