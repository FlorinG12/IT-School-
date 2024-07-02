package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class    Challenge10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Print 'Hello World' ");
            System.out.println("2. Print the user`s Name: ");
            System.out.println("3. Exit ");
            System.out.println("Enter your choice ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Hello World");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Enter your Username");
                    String  userName = scanner.nextLine();
                    System.out.println("Your Username is : " +userName);
                    System.out.println(" ");
                    scanner.close();
                        break;
                case 3:
                    System.out.println(" ");
                    System.out.println("Goodbye!");
                    System.out.println(" ");
                    return;
                default:
                    System.out.println(" ");
                    System.out.println("Invalid choice.Please try another number !");
                    System.out.println(" ");
                    break;
            }
        }
    }

}
