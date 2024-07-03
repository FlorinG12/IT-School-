package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge2 {

    public static void main(String[] args) {

        List<String> christmasWishlist = new ArrayList<>(Arrays.asList("Toys", "Candies", "Fruits"));
        christmasWishlist.add("Bicycle");

        System.out.println(christmasWishlist);
    }
}
