package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();

        String name = firstName +" "+ lastName;
        System.out.println("Hello! " + name);
    }
}