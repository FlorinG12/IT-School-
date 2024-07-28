package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge9 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("An");
        list.add("per");
        list.add("keeps the doctor away");

        list.add(1,"apple");
        list.add(3,"day");
        System.out.println(list);
    }
}