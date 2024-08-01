package session_17_equals_hashcode_generics.challenge.challenge_2;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("Wick", "John", 21);
        Person person1 = new Person("Wick", "John", 21);

        System.out.println("Is person equal to person1: " + person.equals(person1));
        System.out.println(person.hashCode() + " " + person1.hashCode());
    }
}