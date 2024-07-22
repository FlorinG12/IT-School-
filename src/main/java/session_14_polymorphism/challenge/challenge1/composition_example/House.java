package session_14_polymorphism.challenge.challenge1.composition_example;

public class House {
    private Door door;
    private char state;

    public House(Door door, char state) {
        this.door = door;
        this.state = state;
    }

    public void doorPosition() {
        if (state == 'O') {
            door.open();
        } else if (state == 'C') {
            door.close();
        } else {
            System.out.println("Invalid state");
        }
    }
}