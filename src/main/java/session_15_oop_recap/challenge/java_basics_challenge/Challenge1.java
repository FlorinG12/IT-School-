package session_15_oop_recap.challenge.java_basics_challenge;

public class Challenge1 {

    public static void main(String[] args) {
        int num1 = 153222;
        int num2 = 532111;
        int result = num1 * num2;
        long longResult = (long) num1 * num2;

        if (result < longResult) {
            System.out.println("long result=" + longResult);
        } else {
            System.out.println("int result =" + result);
        }
    }
}