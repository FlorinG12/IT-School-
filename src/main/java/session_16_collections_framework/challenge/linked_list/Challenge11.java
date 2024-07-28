package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge11 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Robin");
        list.add("Alice");
        list.add("Bob");
        list.add("Marley");

        System.out.println("The position of " + list.get(0) + " is at position " + list.indexOf("Robin"));
    }
}