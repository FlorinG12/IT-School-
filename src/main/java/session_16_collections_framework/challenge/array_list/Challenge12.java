package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge12 {

    public static void main(String[] args) {
        List<String> schedule = new ArrayList<>();
        schedule.add("08.00 Wake up");
        schedule.add("08.30 Breakfast");
        schedule.add("09.00 Go to work");

        schedule.get(1);
        System.out.println(schedule.get(1));

        schedule.subList(0, 2);
        System.out.println(schedule.subList(1, 2));
    }
}