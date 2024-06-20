package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Username:");
        String user = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println(" ");

        while (true) {
            System.out.println("Hello " + user);
            System.out.println("1. Print a message: ");
            System.out.println("2. Print your age");
            System.out.println("3. Exit");
            System.out.println("Enter your choice ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Today is a wonderful day and I hope you feel amazing " + user);
                    System.out.println(" ");
                    break;
                case 2:
                    if (age < 18) {
                        System.out.println(" ");
                        System.out.println(user + " You have " + age + " years old and you are a teenager ");
                        System.out.println(" ");
                        break;
                    }
                    else {
                        System.out.println(" ");
                        System.out.println(user + " You have " + age + " years old and you are an adult ");
                        System.out.println(" ");
                        break;
                    }
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
