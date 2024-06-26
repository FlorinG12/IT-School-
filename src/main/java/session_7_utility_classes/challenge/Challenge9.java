package session_7_utility_classes.challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date: yyyy-MM-dd");
        String firstDate = scanner.nextLine();

        System.out.println("Enter the second date: yyyy-MM-dd");
        String secondDate = scanner.nextLine();

        long daysResult = daysBetween(firstDate, secondDate);
        System.out.println("Days difference between: " + firstDate + " and " + secondDate + " is " + daysResult + " days");
    }

    public static long daysBetween(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate firstDate = LocalDate.parse(date1, formatter);
        LocalDate secondDate = LocalDate.parse(date2, formatter);

        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }

}
