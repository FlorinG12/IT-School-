package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String message = scanner.nextLine();

        System.out.println(message.replace('a','w'));
    }
}