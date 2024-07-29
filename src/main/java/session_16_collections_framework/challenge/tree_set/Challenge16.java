package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge16 {

    public static void main(String[] args) {
        TreeSet<String> dogName = new TreeSet<>();
        dogName.add("Rex");
        dogName.add("Lola");
        dogName.add("Misha");
        dogName.add("Mark");

        System.out.println(dogName);
        System.out.println(dogName.remove("Mark"));
        System.out.println(dogName);
    }
}