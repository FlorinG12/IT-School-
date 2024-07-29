package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge15 {

    public static void main(String[] args) {
        TreeSet<String> cityName = new TreeSet<>();
        cityName.add("Bahamas");
        cityName.add("Italy");
        cityName.add("Germany");
        displayTreeSet(cityName);
        System.out.println();

        String lastElement = cityName.last();
        cityName.remove(lastElement);
        displayTreeSet(cityName);
    }

    public static void displayTreeSet(TreeSet<String> set) {
        for (String treeSet : set) {
            System.out.println(treeSet + " ");
        }
    }
}