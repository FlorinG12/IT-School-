package session_9_arrays.challenge;

import java.util.Arrays;

public class Challenge4 {

    public static void main(String[] args) {
        int countEven = 0;
        int countOdd = 0;

        int[] arrayList = {2, 15, 6, 18, 22, 4, 36, 111, 53, 40,};

        for (int num : arrayList) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("We have in this array " + countEven+ " even numbers and "+countOdd+ " odd  numbers" );
    }
}
