package session_14_polymorphism.challenge.challenge1.composition_example;

public class TestHomeComposition {

    public static void main(String[] args) {
        Door door = new Door();

        House house1 = new House(door, 'O');
        house1.doorPosition();
        House house2 = new House(door, 'C');
        house2.doorPosition();
        House house3 = new House(door, 'i');
        house3.doorPosition();
    }
}
