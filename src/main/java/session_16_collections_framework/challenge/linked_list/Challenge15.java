package session_16_collections_framework.challenge.linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class Challenge15 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("update");
        list.add("run");
        list.add("build");

        System.out.println(list);
        Collections.swap(list, 0, 2);
        System.out.println(list);
        Collections.swap(list, 2, 1);
        System.out.println(list);
    }
}