package session_17_equals_hashcode_generics.challenge.challenge_13;

public class TestDay {

    public static void main(String[] args) {
        DayScheduler monday = new DayScheduler(DayOfWeek.MONDAY);
        monday.put("08:00-09:00", "Wake up routine and Breakfast");
        monday.put("09:00-12:00", "Start learning");
        monday.put("15:00", "Go to dentist");
        printSchedule(monday);

        DayScheduler saturday = new DayScheduler(DayOfWeek.SATURDAY);
        saturday.put("10:00", "Wake up");
        saturday.put("12:00", "Go to party");
        printSchedule(saturday);
    }

    public static void printSchedule(DayScheduler day) {
        for (String anotherDay : day.keySet()) {
            System.out.println(anotherDay + " " + day.get(anotherDay));
        }
        System.out.println("");
    }
}