package session_5_advanced_flow_control.challenge;

public class Challenge8 {

    public static void main(String[] args) {
        int number = 10, firstTerm = 0, secondTerm = 1;
        for (int index = 1; index <= number; index++) {
            System.out.println(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
