package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.List;

public class Challenge2 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");

        for (String days : list) {
            System.out.println(days);
        }
    }
}