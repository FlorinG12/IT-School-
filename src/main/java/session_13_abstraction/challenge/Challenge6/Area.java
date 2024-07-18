package session_13_abstraction.challenge.Challenge6;

public class Area extends Shape {

    @Override
    public void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }

    @Override
    public void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of square is: " + area);
    }

    @Override
    public void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of a circle is: " + area);
    }

    public static void main(String[] args) {
        Area area = new Area();
        area.rectangleArea(12, 4);
        area.squareArea(6);
        area.circleArea(2.5);
    }
}
