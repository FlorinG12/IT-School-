package session_18.challenge.challenge_6;

public class StringCompareTest {

    public static void main(String[] args) {
        StringComparator stringLength = (s1, s2) -> Integer.compare(s1.length(), (s2.length()));

        String str1 = "Hello everyone";
        String str2 = "Welcome!";

        int result = stringLength.compare(str1, str2);
        System.out.println(result);
    }
}