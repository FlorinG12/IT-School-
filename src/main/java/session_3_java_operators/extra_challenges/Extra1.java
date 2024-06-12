package session_3_java_operators.extra_challenges;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Price of product : ");
        double product = scanner.nextDouble();
        System.out.println("Money received: ");
        double money = scanner.nextDouble();

        double rest = product - money;
        System.out.println("Rest = " + rest);

    }
}
