package session_17_equals_hashcode_generics.challenge.challenge_10;

import java.time.LocalDate;

public class AppInformation {

    private long id;
    private String name;
    private LocalDate dateTime;
    private String version;

    public AppInformation(long id, String name, LocalDate dateTime, String version) {
        this.id = id;
        this.name = name;
        this.dateTime = dateTime;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public String getVersion() {
        return version;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "App info:" + name +
                " Version info: " + version +
                " Update on : " + dateTime;
    }
}