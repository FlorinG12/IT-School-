package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase");
        String  phrase = scanner.nextLine();
        System.out.println(phrase.substring(0,5));
    }
}