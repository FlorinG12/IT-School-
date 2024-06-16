package session_4_java_operators_and_loops.challenges;

public class Challenge18 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int index = 0; index < array.length; index++) {
            array[index] = index + 1;
        }
        System.out.println("The array before decrement");
        for (int numbers : array) {
            System.out.println(numbers + "");
        }
        for (int index = 0; index < array.length; index++) {
            array[index] = index - 1;
        }
        System.out.println("The array after decrement;");
        for (int numbers : array) {
            System.out.println(numbers + "");
        }
    }
}
