package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge17 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("M001");
        list.add("M002");
        list.add("M003");
        list.add("M004");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("M010");
        list2.add("M011");
        list2.add("M012");

        list.addAll(list2);
        System.out.println(list);
    }
}