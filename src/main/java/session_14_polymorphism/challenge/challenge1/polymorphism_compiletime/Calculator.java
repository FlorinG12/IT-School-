package session_14_polymorphism.challenge.challenge1.polymorphism_compiletime;

public class Calculator {

    public double makeOperation(double a, double b) {
        return a + b;
    }

    public int makeOperation(int a, int b) {
        return a + b;
    }

    public double makeOperation(double a, double b, double c) {
        return a + b + c;
    }
}
