package session_4_java_operators_and_loops.challenges;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your temperature is :");
        int temperature = scanner.nextInt();

        if (temperature >= 30) {
            System.out.println("Hot");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else if (temperature < 20) {
            System.out.println("Cold");
        }
    }
}
