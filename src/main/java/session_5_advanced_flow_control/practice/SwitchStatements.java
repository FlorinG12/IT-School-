package session_5_advanced_flow_control.practice;

import java.util.Scanner;

public class SwitchStatements {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static void main(String[] args) {
        printGrade();
        printSeason();
        printDayOfWeek();
    }

    private static void printDayOfWeek() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number from 1 to 7 for the day of the week");
        int day = sc.nextInt();
        sc.close();
        switch (day) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Not a day ");
        }
    }

    private static void printSeason() {
        String season = "Summer";

        switch (season) {
            case "Winter":
                System.out.println("It`s cold");
                break;
            case "Summer":
                System.out.println("It`s hot");
                break;
            case "Spring":
                System.out.println("Nature rise");
                break;
            default:
                System.out.println("Unknown season");
        }
    }

    private static void printGrade() {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Congratulation");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Grade not recognized");
        }
    }
}
