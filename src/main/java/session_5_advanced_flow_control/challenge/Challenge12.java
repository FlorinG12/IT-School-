package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 10;
        System.out.println("Enter 10 numbers");
        for (int index = 0; index < count ;index++) {
            System.out.println("Enter number " +(index + 1 ) + ": ");
            double numbers = scanner.nextDouble();

            if (numbers <= 5){
                continue;
            }
            sum +=numbers;
            System.out.println("The sum of this numbers is " + sum );
        }


    }
}
