package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Challenge2 {

    public static void main(String[] args) {
        HashSet<String> myList = new HashSet<>();
        myList.add("car");
        myList.add("house");
        myList.add("holidays");

        for (String wishList : myList) {
            System.out.println(wishList);
        }
    }
}