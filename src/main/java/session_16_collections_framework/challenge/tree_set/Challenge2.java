package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge2 {

    public static void main(String[] args) {
        TreeSet<String> color = new TreeSet<>();
        color.add("blue");
        color.add("red");
        color.add("green");
        color.add("white");

        printTreeSet(color);
    }

    public static void printTreeSet(TreeSet<String> color) {
        for (String colour : color) {
            System.out.println(colour + " ");
        }
    }
}