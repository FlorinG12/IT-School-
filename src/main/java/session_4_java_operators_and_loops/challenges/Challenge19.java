package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class Challenge19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entey your age : ");
        int age = scanner.nextInt();
        String category = (age < 12) ? "Child" : (age <= 17) ? "Teenager" : (age <= 64) ? "Adult" : "Senior";
        System.out.println(category);
    }
}
