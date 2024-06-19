package session_5_advanced_flow_control.practice;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {

    public static void main(String[] args) {
printNumberWithWhile(10);
printNumberWithDoWhile(10);
        printNumberWithFor(12);

        int[] arrayExample = {2, 4, 6};
        List<String> countries = new ArrayList<>();
        countries.add("Belgium");
        countries.add("Russia");
        countries.add("Romania");

        //     printListWithForEach(countries);
        printCountriesWithFor(countries);
    }

    public static void printNumberWithWhile(int input) {
        int number = 1;

        while (number <= input) {
            System.out.println("Number is: " + number);
            ++number;
        }
    }

    public static void printNumberWithDoWhile(int input) {
        int number = 1;
        do {
            System.out.println("Number: " + number);
            ++number;
        } while (number <= input);
    }

    public static void printNumberWithFor(int input) {
        for (int number = 1; number <= input; number++) {
            System.out.println("Number: " + number);
        }
    }

    public static void printListWithForEach(List<String> list) {
        for (String country : list) {
            System.out.println("Country from the list: " + country);
        }
    }

    public static void printCountriesWithFor(List<String> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.println("Country from the list: " +list.get(index));
        }
    }
}

