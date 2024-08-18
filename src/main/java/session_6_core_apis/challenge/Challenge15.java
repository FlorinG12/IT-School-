package session_6_core_apis.challenge;

public class Challenge15 {

    public static void main(String[] args) {
        String word1 = "big";
        String word2 = "gib";

        System.out.println(checkAnagram(word1, word2));
    }

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String sort1 = stringSort(str1);
        String sort2 = stringSort(str2);

        return sort1.equalsIgnoreCase(sort2);
    }

    public static String stringSort(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
            sb.append(c);

            for (int i = 0; i < sb.length() - 1; i++) {
                for (int j = i + 1; j < sb.length(); j++) {
                    if (sb.charAt(i) > sb.charAt(j)) {
                        char ch = sb.charAt(i);
                        sb.setCharAt(i, sb.charAt(j));
                        sb.setCharAt(j, ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}