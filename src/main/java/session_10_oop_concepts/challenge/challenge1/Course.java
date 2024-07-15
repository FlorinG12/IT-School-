package session_10_oop_concepts.challenge.challenge1;

import java.time.LocalDate;

public class Course {

    String duration;
    String description;

    public Course(String duration, String schedule, String description) {
        this.duration = duration;
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
