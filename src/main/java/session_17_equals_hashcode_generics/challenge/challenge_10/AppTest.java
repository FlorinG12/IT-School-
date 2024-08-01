package session_17_equals_hashcode_generics.challenge.challenge_10;

import java.time.LocalDate;

public class AppTest {

    public static void main(String[] args) {
        LocalDate lastUpdateDate = LocalDate.of(2024, 05, 12);
        
        AppInformation app = new AppInformation(19856, "Domination", lastUpdateDate, "1.55");
        System.out.println(app);
    }
}