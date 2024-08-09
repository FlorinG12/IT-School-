package session_19.challenge.challenge_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));
        List<Person> adults = people.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());

        System.out.println(adults);
    }
}