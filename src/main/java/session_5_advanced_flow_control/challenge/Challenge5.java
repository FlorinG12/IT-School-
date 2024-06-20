package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your 'n' number:");
        int n = scanner.nextInt();
        scanner.close();

        fibonacciSeries(n);
    }

    public static void fibonacciSeries(int n) {
        if (n > 0) {
            System.out.println("The number should be more than 0");
        }
        int firstTerm = 0;
        int secondTerm = 1;

        for (int index = 1; index <= n; index++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }

    }
}
