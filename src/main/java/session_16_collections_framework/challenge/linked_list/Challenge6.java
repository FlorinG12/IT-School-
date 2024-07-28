package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge6 {

    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(0, 0);
        number.add(number.size(), 5);
        System.out.println(number);
    }
}