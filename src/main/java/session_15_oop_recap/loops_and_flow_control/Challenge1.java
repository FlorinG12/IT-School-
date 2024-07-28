package session_15_oop_recap.loops_and_flow_control;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Your number " + number + " is even");
        } else {
            System.out.println("Your number " + number + " is odd");
        }
    }
}