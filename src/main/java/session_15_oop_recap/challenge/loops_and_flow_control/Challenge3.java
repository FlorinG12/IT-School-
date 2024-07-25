package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int factorial = 1;

        for (int index = 1; index <= number; index++) {
            factorial = factorial * index;
        }
        System.out.println("Factorial of : " + number + " is " + factorial);
    }
}