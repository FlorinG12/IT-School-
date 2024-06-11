package session_3_java_operators.Challenge;

import java.util.Scanner;

public class ChallengeSession3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first Number");
        int x = scanner.nextInt();
        System.out.println("Enter your second Number");
        int y = scanner.nextInt() ;

        int addition = x + y;
        int subtraction = x - y;
        int multiplication = x * y;
        int division = x / y;
        int modulus = x % y;

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division= " + division);
        System.out.println("Modulus= " + modulus);
    }
}
