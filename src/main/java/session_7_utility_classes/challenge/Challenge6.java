package session_7_utility_classes.challenge;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Challenge6 {

    public static void main(String[] args) {
        displayCurrentTime();
    }
    public static void displayCurrentTime() {

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String actualTime = currentTime.format(formatter);

        System.out.println("My time here is: " + actualTime);
    }
}
