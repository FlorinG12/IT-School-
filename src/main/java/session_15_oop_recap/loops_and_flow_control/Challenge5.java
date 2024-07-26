package session_15_oop_recap.loops_and_flow_control;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);
        System.out.println(" The sum of your number is equal to : " + sum);
    }
}