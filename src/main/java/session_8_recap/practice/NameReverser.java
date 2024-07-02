package session_8_recap.practice;

import java.util.Scanner;

public class NameReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        scanner.close();

        for (int i = name.length() - 1; i >= 0; i--) ;
        System.out.print(name.charAt(name.length()));
    }
}
