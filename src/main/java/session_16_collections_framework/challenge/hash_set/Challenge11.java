package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Challenge11 {

    public static void main(String[] args) {

        HashSet<String> name = new HashSet<>();
        name.add("John");
        name.add("Alice");
        name.add("Robert");
        name.add("Ronaldo");

        HashSet<String> name1 = new HashSet<>();
        name1.add("Jack");
        name1.add("Alice");
        name1.add("Roby");
        name1.add("Ronaldo");

        name.retainAll(name1);
        System.out.println("the same element int this hashSet is " + name);
    }
}