package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("Enter a number ");
            int number = scanner.nextInt();
            if (number > 0) {
            } else {
                break;
            }
            result += number;
        }
        System.out.println("The result of your numbers is : " + result);
    }
}