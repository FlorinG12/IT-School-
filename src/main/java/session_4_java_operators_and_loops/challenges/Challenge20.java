package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = scanner.nextInt();

        System.out.println("Enter the second number :");
        int b = scanner.nextInt();

        System.out.println("Enter the third number :");
        int c = scanner.nextInt();

        int largestNum = (a > b) ? (a > c ? a : c) : (b >= c ? b : c);
        System.out.println("The largest number is " + largestNum);
    }
}
