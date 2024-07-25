package session_15_oop_recap.challenge.java_basics_challenge;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter float numbers: ");
        float f1 = scanner.nextFloat();
        float f2 = scanner.nextFloat();
        float f3 = scanner.nextFloat();

        float result = f1 + f2 + f3;
        if (result == Float.POSITIVE_INFINITY || result == Float.NEGATIVE_INFINITY) {
            System.out.println("The number is lager than FLOAT.MAX_VALUE");
        } else {
            float average = result / 3;
            System.out.println("Your average is : " + average);
        }
        float max = Float.MAX_VALUE;
        System.out.println(max);
    }
}