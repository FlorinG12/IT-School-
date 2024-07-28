package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge19 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        list.remove(0);
        System.out.println("List after remove an element " + list + " now the first element is : " + list.get(0));
    }
}