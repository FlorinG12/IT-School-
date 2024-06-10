package session_3_java_operators;

public class PostIncrementAndDecrementOperators {
    public static void main(String[] args) {
        int x = 4;
        int y = x--;

        System.out.println("x: " + x);
        System.out.println( "y: " + y );

        int q = 3;
        int z = q++;

        System.out.println("q: " + q);
        System.out.println( "z: " + z );
    }
}
