package session_3_java_operators.Challenge;

import java.util.Scanner;

public class Ch6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Type second  number");
        double secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber) {
            System.out.println("First number is greater");

        }else  if (firstNumber < secondNumber) {
            System.out.println("First number is less or equal than ");
        } else  {
            System.out.println("First number is equal to second number");
        }

    }
}
