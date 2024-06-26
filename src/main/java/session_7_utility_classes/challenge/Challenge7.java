package session_7_utility_classes.challenge;

import java.time.LocalDate;

public class Challenge7 {

    public static void main(String[] args) {
        int addWeeks = 5;
        LocalDate todayDate = LocalDate.now();
        LocalDate newDate = addWeeksToToday(addWeeks);
        System.out.println("Date form today: " + todayDate + " + " + addWeeks + " weeks is equal to : " + newDate);
    }
    public static LocalDate addWeeksToToday(int weeks) {

        LocalDate today = LocalDate.now();
        LocalDate resultDate = today.plusWeeks(weeks);

        return resultDate;
    }
}
