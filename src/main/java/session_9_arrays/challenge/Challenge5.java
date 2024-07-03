package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validCity = true;

        ArrayList<String> cityNames = new ArrayList<>();
        cityNames.add("Berlin");
        cityNames.add("Bucharest");
        cityNames.add("Madrid");
        cityNames.add("Athena");
        cityNames.add("Roma");

        while (validCity) {
            System.out.println("Enter a city name :");
            String inputCity = scanner.nextLine();
            System.out.println("");

            if (containNumbers(inputCity)) {
                System.out.println("No numbers allow");
                continue;
            }

            if (cityNames.contains(inputCity)) {
                System.out.println("We have the same value in the list. Try another country !! ");

            } else {
                cityNames.add(inputCity);
                System.out.println(" NEW city added: " + inputCity);
                validCity = false;
            }
        }
        System.out.println("City list: " + cityNames);

    }

    public static boolean containNumbers(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

}