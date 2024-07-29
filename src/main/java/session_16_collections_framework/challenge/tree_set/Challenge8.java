package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge8 {

    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("Kevin");
        name.add("Carol");
        name.add("Rick");

        TreeSet<String> name1 = new TreeSet<>();
        name1.add("Kevin");
        name1.add("Carol");
        name1.add("Rick");

        compareTreeSet(name, name1);
    }

    public static void compareTreeSet(TreeSet<String> set1, TreeSet<String> set2) {
        if (set1.equals(set2)) {
            System.out.println("TreeSets are equal");
        } else if (set1.size() == set2.size()) {
            System.out.println("TreeSets have the same number of elements");
        } else {
            System.out.println("TreeSets are nit equal");
        }
    }
}