package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter a number ");
            int primeNumber = scanner.nextInt();

            if (primeNumber <= 1 || primeNumber % 2 == 0) {
                System.out.println(" Not a prime number [" + primeNumber + "]");
            } else {
                System.out.println(" This is a prime number (" + primeNumber + ")");
                isTrue = false;
            }
        }
    }
}