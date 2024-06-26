package session_7_utility_classes.challenge;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        areDatesEqual();
    }

    public static void areDatesEqual() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first date : YYYY-MM-DD");
            String firstDateInput = scanner.next();
            LocalDate fistDate = LocalDate.parse(firstDateInput);

            System.out.println("Enter the second date : YYYY-MM-DD");
            String secondDateInput = scanner.next();
            LocalDate secondDate = LocalDate.parse(secondDateInput);
            System.out.println(fistDate.isEqual(secondDate));

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format  try yyyy-mm-dd");
        }
        scanner.close();
    }
}
