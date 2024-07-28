package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.List;

public class Challenge5 {

    public static void main(String[] args) {
        List<String> name = new LinkedList<>();
        name.add("first name");
        name.add("last name");
        name.add(1,"middle name");
        System.out.println(name);
    }
}