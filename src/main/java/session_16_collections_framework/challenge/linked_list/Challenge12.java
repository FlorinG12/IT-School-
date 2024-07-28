package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge12 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("21");
        list.add("D");

        list.remove(list.indexOf("21"));
        System.out.println(list);
    }
}