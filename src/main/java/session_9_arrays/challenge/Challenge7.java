package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Challenge7 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Watermelon", "Cherry", "Strawberries", "Banana", "Oranges", "Berries"));

        Collections.sort(fruits, (fruits1, fruits2) -> Integer.compare(fruits2.length(), fruits1.length()));


        for (String frt : fruits) {
            System.out.println(frt +" " + frt.length());


        }

    }


}
