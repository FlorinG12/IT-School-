package session_6_core_apis.challenge;

public class Challenge14 {

    public static void main(String[] args) {
        String message = "This is my code  //And this is my comment \n " +
                "Another line of code /* Another comment */ \n";
        System.out.println(removeComments(message));

    }

    public static String removeComments(String str) {
        StringBuilder sb = new StringBuilder();
        boolean inLineComment = false;
        boolean inBlockComment = false;

        for (int index = 0; index < str.length(); index++) {
            if (index < str.length() - 1 && str.charAt(index) == '/' && str.charAt(index) == '*' && !inLineComment) {
                inBlockComment = true;
                index++;
            } else if (index < str.length() - 1 && str.charAt(index) == '*' && str.charAt(index) == '/' && inBlockComment) {
                inBlockComment = false;
                index++;
            } else if (index < str.length() - 1 && str.charAt(index) == '/' && str.charAt(index) == '/' && !inBlockComment) {
                inLineComment = true;
                index++;
            } else if (str.charAt(index) == '\n' && inLineComment) {
                inLineComment = false;
            } else if (!inBlockComment && !inLineComment) {
                sb.append(str.charAt(index));
            }
        }
        return sb.toString();
    }
}