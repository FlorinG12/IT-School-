package session_15_oop_recap.challenge.java_basics_challenge;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first boolean");
        boolean bol1 = scanner.nextBoolean();
        System.out.println("Enter the second boolean");
        boolean bol2 = scanner.nextBoolean();

        if (bol1 && bol2 == true) {
            System.out.println("Your result is true ");
        } else if (bol1 || bol2 == true) {
            System.out.println("Your result is partial true ");
        } else if (!bol1 == !bol2) {
            System.out.println("Your result is false");
        }
    }
}