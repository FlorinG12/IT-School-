package session_14_polymorphism.challenge.challenge1.polymorphism_compiletime;

public class Geometry {

    public double area(double side) {
        return side * side;
    }

    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}
