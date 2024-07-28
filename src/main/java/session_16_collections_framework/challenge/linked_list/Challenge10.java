package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge10 {

    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("Romania");
        countries.add("Spain");
        countries.add("France");
        countries.add("Republic Moldova");

        System.out.println("First element in the list is: " + countries.getFirst());
        System.out.println("The last element from the list is:" + countries.getLast());
    }
}