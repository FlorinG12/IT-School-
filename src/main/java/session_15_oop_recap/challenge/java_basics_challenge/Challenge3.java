package session_15_oop_recap.challenge.java_basics_challenge;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        String number = sc.next();

        try {
            int stringToInt = Integer.parseInt(number);
            System.out.println("Your number is : " + stringToInt);
        } catch (NumberFormatException e) {
            System.out.println("You have to add only integers");
        }
        sc.close();
    }
}