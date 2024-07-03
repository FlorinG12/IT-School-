package session_9_arrays.challenge;

import kata.session_1.Person;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean next = true;

        while (next) {
            try {
                System.out.println("Enter first number :");
                double index1 = checkNumber(scanner);

                System.out.println("Enter the operator: '+'-'*'/'");
                char operator = operatorSymbol(scanner);

                System.out.println("Enter the second number :");
                double index2 = checkNumber(scanner);

                double result = performOperation(index1, index2, operator);

                System.out.println("Your result is : " + result);

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());

            }
            System.out.println("Do you want to make another operation yes/no");
            String continueOperation = scanner.next();
            if (containNumber(continueOperation)) {
                System.out.println("No number allow .Try Again");
            } else if (!continueOperation.equalsIgnoreCase("yes")) {
                next = false;
            }
        }
        scanner.close();
    }

    public static double checkNumber(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            try {
                double number = Double.parseDouble(input);
                if (number > Double.MAX_VALUE || number < -Double.MAX_VALUE) {
                    System.out.println("Number is too large");
                }
                return number;
            } catch (Exception e) {
                System.out.println(" Please add a valid number");
            }

        }
    }

    public static char operatorSymbol(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            if (input.length() == 1 && "+-/*".contains(input)) {
                return input.charAt(0);
            } else {
                System.out.println("Invalid Operator ...Please try again with one of this '+'-'/'*'");
            }

        }
    }

    public static double performOperation(double num1, double num2, char operator) throws Exception {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("The second number cannot be 0");
                }
                return num2 == 0 ? 0 : num1 / num2;
            default:
                throw new Exception("Unexpected message");
        }

    }

    public static boolean containNumber(String input) {

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
