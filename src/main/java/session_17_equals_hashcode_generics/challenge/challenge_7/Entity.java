package session_17_equals_hashcode_generics.challenge.challenge_7;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

public class Entity {

    private int id;
    private String name;
    private Timestamp timestamp;

    public Entity(int id, String name, Timestamp timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity that = (Entity) o;
        return id == that.id && timestamp == that.timestamp && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, timestamp);
    }
}