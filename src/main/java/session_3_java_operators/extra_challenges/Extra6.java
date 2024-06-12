package session_3_java_operators.extra_challenges;

import java.util.Scanner;

public class Extra6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println(name+ " you are eligible to vote");
        }else {
            System.out.println(name+ " you are not eligible to vote ");
        }
    }
}
