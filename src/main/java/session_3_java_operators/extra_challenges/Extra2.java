package session_3_java_operators.extra_challenges;

import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your temperature °C");
        double c = scanner.nextDouble();
        double f = (c * 9 / 5) + 32.;
        System.out.println("Your temperature in °F is: " + f);
    }
}
