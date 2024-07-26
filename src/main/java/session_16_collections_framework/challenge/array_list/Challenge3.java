package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge3 {

    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("first element");
        list.add("second element");
        list.add("third element");
        list.add(2,"new element");
        list.add(2,"another element");

        System.out.println(list);
    }
}