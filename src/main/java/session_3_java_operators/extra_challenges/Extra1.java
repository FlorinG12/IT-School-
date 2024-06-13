package session_3_java_operators.extra_challenges;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double item = 23.99;
        double money = 100;
        System.out.println("Quantity of product :");
        int quantity = scanner.nextInt();
        double total = item * quantity;
        double rest = money - total;
        System.out.println("Your products cost : " + total + " and the rest is : " + rest);
    }
}
