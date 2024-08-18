package session_6_core_apis.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge10 {
    private static final Map<Character, String> morseCodeMap = new HashMap<>();

    static {
        // Morse code map for letters A-Z
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");

        // Morse code map for digits 0-9
        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a message");
        String message = sc.nextLine();

        String convertToMorseCode = "Your message : <" + message + "> looks like this in morse code: " + morseConverter(message);
        System.out.println(convertToMorseCode);
    }

    public static String morseConverter(String str) {
        StringBuilder morseCode = new StringBuilder();
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                morseCode.append(" / ");
            } else if (morseCodeMap.containsKey(ch)) {
                morseCode.append(morseCodeMap.get(ch)).append(" ");
            }
        }
        return morseCode.toString().trim();
    }
}