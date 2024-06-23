package session_6_core_apis.challenge;

import java.util.List;

public class Challenge4 {
    public static void main(String[] args) {
        String message = "This is my message";

        String result = removeVowels(message);
        System.out.println("Message without vowels: " + result);
    }


    public static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!isVowel(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}