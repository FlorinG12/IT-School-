package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your price is :");
        double price = scanner.nextDouble();
        System.out.println("Discount %");
        double discount = scanner.nextDouble();
        double priceWithDiscount = price * (discount / 100);
        price -= priceWithDiscount;
        System.out.println("The price with discount is: " + price);
    }
}
