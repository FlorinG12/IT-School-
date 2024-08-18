package session_6_core_apis.challenge;

import java.util.HashMap;
import java.util.Map;

public class Challenge9 {

    public static void main(String[] args) {
        String str = "Let s goo and make this code easy!!!";
        frequencyCharacter(str);
    }

    public static void frequencyCharacter(String str) {
        StringBuilder sb = new StringBuilder(str);
        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }
        System.out.println("Character with corresponding frequency");
        for (Map.Entry<Character, Integer> freqIterate : frequency.entrySet()) {
            if (freqIterate.getKey() != ' ') {
                System.out.println(freqIterate.getKey() + " - " + freqIterate.getValue());
            }
        }
    }
}