package session_15_oop_recap.challenge.loops_and_flow_control;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day o week ");
        String day = scanner.next();

        switch (day.toUpperCase()) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println("Week Day");
            case "SATURDAY", "SUNDAY" -> System.out.println("Weekend Day");
            default -> System.out.println("Enter a valid day o week ");
        }
    }
}