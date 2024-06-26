package session_7_utility_classes.challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthday (in this format yyyy-MM-dd) please ");
        String birthday = scanner.nextLine();

        scanner.close();
        if (isValidDate(birthday)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean isValidDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(date.formatted());
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
