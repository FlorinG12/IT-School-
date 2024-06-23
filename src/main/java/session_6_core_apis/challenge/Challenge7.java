package session_6_core_apis.challenge;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scanner.nextLine();

        String result = removeDuplicateCharacters(word);
        System.out.println(result);
    }

    public static String removeDuplicateCharacters(String word) {
        StringBuilder sb = new StringBuilder();
        boolean[] check = new boolean[256];

        for (int f = 0; f < word.length(); f++) {
            char currentChar = word.charAt(f);
            if (!check[currentChar]) {
                check[currentChar] = true;
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}
