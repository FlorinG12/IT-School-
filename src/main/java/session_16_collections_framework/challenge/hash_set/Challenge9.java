package session_16_collections_framework.challenge.hash_set;

import java.util.ArrayList;
import java.util.HashSet;

public class Challenge9 {

    public static void main(String[] args) {
        HashSet<String> nameList = new HashSet<>();
        nameList.add("Dwayne");
        nameList.add("Kevin");
        nameList.add("Solomon");

        displayHashSet(nameList);
        ArrayList<String> nameArrayList = new ArrayList<>(nameList);
        displayArrayList(nameArrayList);
    }

    public static void displayHashSet(HashSet<String> name) {
            System.out.println("Elements of hashSet");
        for (String string : name) {
            System.out.println(string + " ");
        }
    }

    public static void displayArrayList(ArrayList<String> name) {
            System.out.println("Elements of ArrayList");
        for (String string : name) {
            System.out.println(string + " ");
        }
    }
}