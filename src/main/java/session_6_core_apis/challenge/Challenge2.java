package session_6_core_apis.challenge;

public class Challenge2 {

    public static void main(String[] args) {
        String message = "010010";
        System.out.println("Is this message a palindrome : " + palindrome(message));
    }

    public static boolean palindrome(String str) {
        String cleanString = str.replace("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleanString);
        String reversedString = sb.reverse().toString();
        return cleanString.equals(reversedString);
    }
}

