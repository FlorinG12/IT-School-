package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge4 {

    public static void main(String[] args) {
        TreeSet<String> countryName = new TreeSet<>();
        countryName.add("Romania");
        countryName.add("Ukraine");
        countryName.add("Spain");

        System.out.println(countryName);
        TreeSet<String> countries = new TreeSet<>(countryName.descendingSet());
        System.out.println(countries);
    }
}