package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        while (true) {
            System.out.print("Enter your number (when you enter -1 the process stop): ");
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }
            sum += number;
        }
        scanner.close();
        System.out.println("The sum of all numbers is: " + sum);
    }
}

