package session_14_polymorphism.practice.compiletime_polymorphism;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2, 3);
        System.out.println(result);
    }
}