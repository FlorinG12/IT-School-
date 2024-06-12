package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The answer is switch so be carefull :) ");
        System.out.println("Is java fun ? true/false : ");
        boolean isJavaFun = scanner.nextBoolean();
        System.out.println("Do you like coding ? true/false");
        boolean likeCoding = scanner.nextBoolean();
        boolean first = !isJavaFun;
        boolean second = !likeCoding;

        System.out.println(first);
        System.out.println(second);
    }
}