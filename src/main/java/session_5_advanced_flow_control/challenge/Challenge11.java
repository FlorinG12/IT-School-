package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        System.out.println("Enter your numbers (0 is for stop the operation):");

        while (true) {
            double numbers = scanner.nextDouble();
            if (numbers == 0) {
                break;
            }
            sum += numbers;
            count++;
        }
        if (count == 0) {
            System.out.println("No numbers");
        } else {
            double average = sum / count;
            System.out.println(" ");
            System.out.println("The average of your numbers is:" + average);
        }
    }
}
