package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge13 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        List<String> list1 = new ArrayList<>();
        list1.add("first");
        list1.add("second");

        if (list.equals(list1)) {
            System.out.println("List have the same elements in the same order");
        } else if (list.size() == list1.size()) {
            System.out.println("List have the same number of elements");
        }
    }
}