package session_15_oop_recap.loops_and_flow_control;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("Enter a series of numbers");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            } else if (number % 2 != 0) {
                continue;
            }
            result += number;
        }
        System.out.println("The result of your even numbers is: " + result);
    }
}