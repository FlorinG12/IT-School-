package session_6_core_apis.challenge;

public class Challenge12 {

    public static void main(String[] args) {
        String message = "helloIStartToLikeJava";
        String messageToSnakeCase = camelToSnake(message);
        System.out.println(messageToSnakeCase);
    }

    public static String camelToSnake(String str) {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            char currentCharacter = str.charAt(index);

            if (Character.isUpperCase(currentCharacter)) {
                result.append("_").append(Character.toLowerCase(currentCharacter));
            } else {
                result.append(currentCharacter);
            }
        }
        return result.toString();
    }
}