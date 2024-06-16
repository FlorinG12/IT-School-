package session_4_java_operators_and_loops.challenges;

public class Challenge16 {
    public static void main(String[] args) {
        int number = 50;
        System.out.println(number);
        number = -number;
        System.out.println(number);
        number = Math.abs(number); //Math.abs is used to return the absolute value (50)
        System.out.println(number);
        number = ++number;
        System.out.println(number);
    }
}
