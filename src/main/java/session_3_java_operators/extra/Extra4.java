package session_3_java_operators.extra;

import java.util.Scanner;

public class Extra4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Your score is : ");
        double score = scanner.nextDouble();
        if (score >= 50) {
            System.out.println("Good job " + name + " you Passed the Exam");
        } else {
            System.out.println("Sorry " + name + " you Failed the Exam");
        }
    }
}
