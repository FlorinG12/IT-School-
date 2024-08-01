package session_17_equals_hashcode_generics.challenge.challenge_11;

import java.util.Arrays;

public class Challenge11 {

    public static void main(String[] args) {
        String[] number = new String[]{"11", "44", "21", "-1", "0"};
        System.out.println("Numbers before swap: " + Arrays.toString(number));
        swapElements(number, 0, 3);
        System.out.println("Numbers after swap: " + Arrays.toString(number));
    }

    public static void swapElements(Object[] a, int index1, int index2) {
        Object swap = a[index1];
        a[index1] = a[index2];
        a[index2] = swap;
    }
}