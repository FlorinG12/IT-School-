package session_3_java_operators.extra_challenges;

import java.util.Scanner;

public class Extra8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First product price :");
        double firstProduct = scanner.nextDouble();
        System.out.println("Second product price");
        double secondProduct = scanner.nextDouble();
        if (firstProduct < secondProduct) {
            System.out.println("First product costs " + firstProduct + " and the second product costs " + secondProduct + " the cheapest is " + firstProduct);
        } else if (firstProduct > secondProduct) {
            System.out.println("First product costs " + firstProduct + " and the second product costs " + secondProduct + " the cheapest is " + secondProduct);
        } else {
            System.out.println("The price of products is the same");
        }
    }
}
