package session_4_java_operators_and_loops.challenges;

public class Challenge5 {
    public static void main(String[] args) {
        printNumbers(10);
    }
    public static void printNumbers(int number) {
        for (int index = 1; index < number; index++) {
            System.out.println(++index);
        }
    }
}