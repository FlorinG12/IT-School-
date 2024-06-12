package session_3_java_operators.extra_challenges;

import java.util.Scanner;

public class Extra5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double groceryBill = 145.99;
        System.out.println("Discount %");
        double discount = scanner.nextDouble();
        double result = groceryBill * (discount / 100);
        double finalBill = groceryBill - result;
        System.out.println("You have to pay: " + finalBill);
    }
}
