package session_15_oop_recap.challenge.java_basics_challenge;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char userInput;

        while (true) {
            System.out.println("Enter a single character");
            String singleCharacter = scanner.nextLine();
            if (singleCharacter.length() == 1) {
                userInput = singleCharacter.charAt(0);
                int numValue = Character.getNumericValue(userInput);
                if (numValue >= 0 && numValue <= 9) {
                    System.out.println("Your value is : " + numValue);
                } else {
                    System.out.println("Not a numeric value");
                }
                break;
            } else {
                System.out.println("Please enter only one character");
            }
        }
        scanner.close();
    }
}