package session_18.challenge.challenge_12;

public class ConcatStringTest {

    public static void main(String[] args) {
        ConcatString combineString = (s1, s2) -> s1 + " " + s2;

        String fullName = combineString.concatStr("The", "Rock");
        System.out.println(fullName);
    }
}