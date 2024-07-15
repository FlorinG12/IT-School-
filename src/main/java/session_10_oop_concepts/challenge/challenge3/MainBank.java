package session_10_oop_concepts.challenge.challenge3;

import java.util.Scanner;

public class MainBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAccount user = new UserAccount();

        user.setUserName("Tom12");
        user.setEmail("Tom.Anderson42@gmail.com");
        user.setAccountId("RO1245124");
        user.setAccountBalance(1500);
        System.out.println(user.getAccountBalance());
        System.out.println("Enter the number what you want to withdraw: ");

        double moneyWithdraw = scanner.nextDouble();
        user.withdrawFunds(moneyWithdraw);
        System.out.println(user);
    }
}