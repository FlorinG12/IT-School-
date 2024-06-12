package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number between 1-100:");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Your number is too low");
        } else if (number <= 100) {
            System.out.println("Your number is : " + number);
        } else if (number > 100) {
            System.out.println("Your number is too high");
        }
    }
}
