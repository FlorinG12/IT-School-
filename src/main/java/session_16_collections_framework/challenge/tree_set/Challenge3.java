package session_16_collections_framework.challenge.tree_set;

import java.util.TreeSet;

public class Challenge3 {

    public static void main(String[] args) {
        TreeSet<String> countryName = new TreeSet<>();
        countryName.add("Romania");
        countryName.add("Ukraine");
        countryName.add("Spain");

        TreeSet<String> countries = new TreeSet<>();
        countries.addAll(countryName);
        System.out.println(countries);
    }
}