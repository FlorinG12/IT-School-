package session_7_utility_classes.challenge;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Challenge11 {

    public static void main(String[] args) {
        String time = "23:00:00";

elapseTimeSince(time);
    }

    public static void elapseTimeSince(String priorTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try {
            LocalTime prior = LocalTime.parse(priorTime, formatter);
            LocalTime now = LocalTime.now();

            Duration duration = Duration.between(prior, now);
            long hours = duration.toHours();
            long minutes = duration.toMinutes() %60;
            long seconds = duration.toSeconds() %60;
            System.out.printf("Elapse time: %02d:%02d:%02d\n", hours, minutes, seconds);
        } catch (DateTimeParseException e) {
            System.out.println("Time format not correct try like this: HH:mm:ss");
        }
    }
}
