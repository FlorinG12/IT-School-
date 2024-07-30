package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;

public class Challenge6 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> number = new HashMap<>();
        number.put(12, -12);
        number.put(15, -15);
        number.put(34, -34);
        number.put(25, -25);
        System.out.println(number);

        HashMap<Integer, Integer> number1 = (HashMap<Integer, Integer>) number.clone();
        number1.put(2141,14124);
        System.out.println(number1);
    }
}