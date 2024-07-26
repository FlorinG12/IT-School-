package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string");
        String secondString = scanner.nextLine();

        System.out.println(firstString.equals(secondString) + "The string isequal");
        System.out.println(firstString != secondString + "Not equal");
    }
}