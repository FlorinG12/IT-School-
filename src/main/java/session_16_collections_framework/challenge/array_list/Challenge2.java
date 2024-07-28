package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");

        iterateArray(list);
    }

    public static void iterateArray(List<String> list) {
        for (String printList : list) {
            System.out.println(printList);
        }
    }
}