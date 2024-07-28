package session_15_oop_recap.challenge.string_manipulation;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        String result = String.format("Hello %s, you have %d years ", name, age);
        System.out.println(result);
    }
}