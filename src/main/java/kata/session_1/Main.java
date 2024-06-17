package kata.session_1;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setName("Mateo");
        firstPerson.setAge(26);
        firstPerson.setAddress("UnitedKingdom");

        Person secondPerson = new Person();
        secondPerson.setName("Alex");
        secondPerson.setAge(30);
        secondPerson.setAddress("Bucharest");

        firstPerson.displayInfo();
        System.out.println("");
        secondPerson.displayInfo();
    }
}
