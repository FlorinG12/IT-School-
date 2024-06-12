package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your integer : ");
        int number = scanner.nextInt();
        int add = ++number;
        System.out.println(add);
        int remove = --number;
        System.out.println(remove);
    }
}
