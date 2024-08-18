package session_6_core_apis.challenge;

public class Challenge8 {

    public static void main(String[] args) {
        String sentence = "Welcome to my ";
        String stringInsert = " code ";
        int index = 13;

        System.out.println("Original string: " + sentence);
        String result = insertStringTo(sentence, stringInsert, index);
        System.out.println("Modified string: " + result);
    }

    public static String insertStringTo(String sentence, String stringInsert, int index) {
        StringBuilder sb = new StringBuilder(sentence);
        sb.insert(index, stringInsert);

        return sb.toString();
    }
}