package session_11_inheritance_encapsulation.practice;

public class TextPerson {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFistName("Ronald");
        person.setLastName("Alvarez");
        person.setAge(26);

        System.out.println("Name " + person.getFistName()+" " +person.getLastName());
        System.out.println("Age " + person.getAge());

        person.setAge(-39);
    }
}
