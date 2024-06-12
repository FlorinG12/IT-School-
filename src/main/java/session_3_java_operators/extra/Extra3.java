package session_3_java_operators.extra;

import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ownerDeposit = "Florin";
        double initialBalance = 5.225;
        double deposit = 12.457;
        System.out.println("Money added :");
        double newBalance = scanner.nextDouble();
        double balance = initialBalance + newBalance;
        System.out.println("Heloo " + ownerDeposit + " your balance is " + balance + " lei");
        System.out.println("Your deposit is : " + deposit + " lei");
    }
}
