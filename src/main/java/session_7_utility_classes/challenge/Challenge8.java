package session_7_utility_classes.challenge;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Challenge8 {

    public static void main(String[] args) {
        String dateInput = "2001-12-08";
        String dateResult = findDayOfWeek(dateInput);
        System.out.println("The day of the week for " + dateInput + " is : " + dateResult);
    }

    public static String findDayOfWeek(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(date, formatter);

            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            return dayOfWeek.toString();
        } catch (DateTimeParseException e) {
            return " Invalid date try like this YYYY-MM-DD";
        }
    }
}
