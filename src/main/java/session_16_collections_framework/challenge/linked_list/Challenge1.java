package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("first element");
        list.add("second element");
        list.add("last element");
        System.out.println(list);
    }
}