package session_6_core_apis.challenge;

public class Challenge11 {

    public static void main(String[] args) {
        String message = "This is my text";
        int shift = 2;

        String encodedMessage = caesarCipher(message, shift);
        System.out.println("Encoded message: " + encodedMessage);

        String decodedMessage = caesarCipher(encodedMessage, -shift);
        System.out.println("Decoded message: " + decodedMessage);
    }

    public static String caesarCipher(String message, int shift) {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < message.length(); index++) {
            char ch = message.charAt(index);

            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shiftChar = (char) ((ch - base + shift) % 26 + base);

                if (shiftChar < base) {
                    shiftChar += 26;
                }
                result.append(shiftChar);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}