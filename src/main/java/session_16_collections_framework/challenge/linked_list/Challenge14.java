package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge14 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one element");
        list.add("two elements");
        list.add("three elements");

        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);
    }
}