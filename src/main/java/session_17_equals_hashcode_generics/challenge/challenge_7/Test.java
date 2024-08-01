package session_17_equals_hashcode_generics.challenge.challenge_7;

import java.sql.Timestamp;

public class Test {

    public static void main(String[] args) {
        Entity entry = new Entity(1241, "element1", new Timestamp(213));
        Entity newEntry = new Entity(1242, "element1",  new Timestamp(213));

        if (entry.equals(newEntry) || entry.hashCode() == newEntry.hashCode()) {
            System.out.println("Entities are equal");
        } else {
            System.out.println("Entity are not equal");
        }
    }
}