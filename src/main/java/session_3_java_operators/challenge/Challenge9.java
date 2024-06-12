package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the length");
        double length = scanner.nextDouble();
        System.out.println("Add the breadth");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.println("Your rectangle result is : " + area);
    }
}
