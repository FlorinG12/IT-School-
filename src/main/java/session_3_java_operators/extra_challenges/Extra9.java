package session_3_java_operators.extra_challenges;

import java.util.Scanner;

public class Extra9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollar = 4.6;
        double euro = 4.98;
        System.out.println("Money amount :");
        double money = scanner.nextDouble();
        double conversionRate = dollar * money / euro;
        System.out.println(conversionRate);
    }
}
