package session_5_advanced_flow_control.challenge;

public class Challenge3 {
    public static void main(String[] args) {
        int[] arrays = {13, 5, 71, 22, 105, 49, -12, -9, -89, -10};
        negativeNumbers(arrays);
        positiveNumbers(arrays);
    }
    public static void negativeNumbers(int[] arrays) {
        int countNegativeNumbers = 0;

        for (int index = 0; index < arrays.length; ++index) {
            if (arrays[index] < 0) {
                ++countNegativeNumbers;
            }
        }
        System.out.println("We have " + countNegativeNumbers + " negative numbers in this array");
    }

    public static void positiveNumbers(int[] arrays) {
        int countPositiveNumbers = 0;
        for (int index = 0; index < arrays.length; ++index) {
            if (arrays[index] > 0) {
                ++countPositiveNumbers;
            }
        }
        System.out.println("We have " + countPositiveNumbers + " positive numbers in the array ");
    }
}