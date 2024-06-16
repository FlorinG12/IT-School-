package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class Challenge21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score : ");
        double score = scanner.nextDouble();
        String finalScore = (score <= 59) ? " F " : (score <= 69) ? " D " : (score <= 79) ? " C " : (score <= 89) ? " B " : " A ";
        System.out.println("Your grade is : " + finalScore);
    }
}
