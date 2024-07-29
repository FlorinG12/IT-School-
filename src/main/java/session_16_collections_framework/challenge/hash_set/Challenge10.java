package session_16_collections_framework.challenge.hash_set;

import java.util.HashSet;

public class Challenge10 {

    public static void main(String[] args) {
        HashSet<String> element = new HashSet<>();
        element.add("Ab");
        element.add("Abc");
        element.add("Abcd");

        HashSet<String> element1 = new HashSet<>();
        element1.add("Aba");
        element1.add("Abc");
        element1.add("Abcd");

        hashSetCompare(element, element1);
    }

    public static void hashSetCompare(HashSet<String> hashSet, HashSet<String> hashSet2) {
        if (hashSet.equals(hashSet2)) {
            System.out.println("hashSets are equal ");
        } else if (hashSet.size() == hashSet2.size()) {
            System.out.println("hasSets have the same number of elements " + hashSet.size() + " and " + hashSet2.size());
        } else {
            System.out.println("hashSet are not equal");
        }
    }
}