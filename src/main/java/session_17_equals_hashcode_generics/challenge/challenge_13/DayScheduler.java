package session_17_equals_hashcode_generics.challenge.challenge_13;

import java.util.TreeMap;

public class DayScheduler extends TreeMap<String, String> {

    private DayOfWeek dayOfWeek;

    public DayScheduler(DayOfWeek dayOfWeek) {
        super();
        this.dayOfWeek = dayOfWeek;
    }

    public void addEvent(String time, String event) {
        this.put(time, event);
    }
    public DayOfWeek getDayOfWeek(){
        return dayOfWeek;
    }
}
