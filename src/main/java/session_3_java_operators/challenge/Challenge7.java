package session_3_java_operators.challenge;

public class Challenge7 {
    public static void main(String[] args) {

        int x = 4;
        double y = 5.4;
        double q = 3.6;
        int w = 2;

        double calc = x + y / q * w;
        System.out.println(calc);
        double result = --y + x / w * ++q;
        System.out.println(result);
    }
}
