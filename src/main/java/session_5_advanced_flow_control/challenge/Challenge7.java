package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int predefinedNumber = 12;
        int number;

        do {
            System.out.println("Guess the number : ");
            number = scanner.nextInt();

            if (number > predefinedNumber) {
                System.out.println("Your number is too high!");
            } else if (number < predefinedNumber) {
                System.out.println("Your number is too low!");
            }

        } while (number != predefinedNumber);
        System.out.println("Congratulation you guess the correct number");
        scanner.close();
    }
}
