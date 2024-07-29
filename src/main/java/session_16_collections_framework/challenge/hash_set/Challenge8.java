package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;
import java.util.TreeSet;

public class Challenge8 {

    public static void main(String[] args) {
        HashSet<Integer> age = new HashSet<>();
        age.add(21);
        age.add(45);
        age.add(32);
        displayHashSet(age);

        TreeSet<Integer> newAge = new TreeSet<>(age);
        displayTreeSet(newAge);
    }

    public static void displayHashSet(HashSet<Integer> number) {
        System.out.println("Numbers of hashSet");
        for (int num : number) {
            System.out.println(num + " ");
        }
    }

    public static void displayTreeSet(TreeSet<Integer> number) {
        System.out.println("Numbers of treeSet");
        for (int num : number) {
            System.out.println(num + " ");
        }
    }
}