package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge7 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("everyone");
        list.add("know");
        list.add("how to swim");
        list.addFirst("Not");
        list.addFirst("Why");
        System.out.println(list);
    }
}