package session_17_equals_hashcode_generics.challenge.challenge_1;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 12);
        Rectangle rectangle1 = new Rectangle(12, 12);

        System.out.println("Rectangle is equal to rectangle1: " + rectangle.equals(rectangle1));
    }
}