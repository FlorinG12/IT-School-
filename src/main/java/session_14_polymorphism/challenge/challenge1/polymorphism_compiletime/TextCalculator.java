package session_14_polymorphism.challenge.challenge1.polymorphism_compiletime;

public class TextCalculator {

    public static void main(String[] args) {
        Calculator sum = new Calculator();
        double result = sum.makeOperation(15.44, 11.19);
        System.out.println(result);
        int res = sum.makeOperation(4, 99);
        System.out.println(res);

        Geometry calcArea = new Geometry();
        double resultArea = calcArea.area(14);
        System.out.println(resultArea);
        resultArea = calcArea.area(14, 12);
        System.out.println(resultArea);

    }
}
