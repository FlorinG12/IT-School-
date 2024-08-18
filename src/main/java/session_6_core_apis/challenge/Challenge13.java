package session_6_core_apis.challenge;

public class Challenge13 {

    public static void main(String[] args) {
        String compressedMessage = "H4e3l2o1 E7v9eryo2n1e";
        String expandedMessage = compressedString(compressedMessage);
        System.out.println(expandedMessage);
    }

    public static String compressedString(String str) {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            char currentChar = str.charAt(index);

            if (index + 1 < str.length() && Character.isDigit(str.charAt(index + 1))) {
                int count = str.charAt(index + 1) - '0';
                for (int index2 = 0; index2 < count; index2++) {
                    result.append(currentChar);
                }
                index++;
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}