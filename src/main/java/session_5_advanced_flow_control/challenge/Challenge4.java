package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you message:");
        String message = scanner.nextLine();
        scanner.close();

        String reverse = new StringBuffer(message).reverse().toString();
        System.out.println(reverse);
    }
}
