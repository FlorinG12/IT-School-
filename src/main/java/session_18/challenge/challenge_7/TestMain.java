package session_18.challenge.challenge_7;

public class TestMain {

    public static void main(String[] args) {
        IntAndString extractor = ((s1, n1) -> n1 >= s1.length() ? s1 : s1.substring(0, n1));

        String result = extractor.lengthOf("Aragon", 12);
        String anotherResult = extractor.lengthOf("War", 2);
        System.out.println(result);
        System.out.println(anotherResult);
    }
}