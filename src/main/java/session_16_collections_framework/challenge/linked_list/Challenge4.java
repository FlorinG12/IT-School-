package session_16_collections_framework.challenge.linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Challenge4 {

    public static void main(String[] args) {
        List<String> listClasses = new LinkedList<>();
        listClasses.add("Math");
        listClasses.add("History");
        listClasses.add("Biology");

        Collections.reverse(listClasses);
        System.out.println(listClasses);
    }
}