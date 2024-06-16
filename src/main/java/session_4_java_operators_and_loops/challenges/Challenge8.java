package session_4_java_operators_and_loops.challenges;

public class Challenge8 {
    public static void main(String[] args) {
        int number = 6;
        int factorial = 2;
        for (int index = 1; index <= number; index++) {
            factorial *= 2;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
