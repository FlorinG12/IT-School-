package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your number ");
        double num = scanner.nextDouble();
        if (num > 0) {
            System.out.println("Your number is positive");
        } else if (num < 0) {
            System.out.println("Your number is negative ");
        }
    }
}
