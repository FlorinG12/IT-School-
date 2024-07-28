package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Challenge3 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(-1);

        int start = 2;
        ListIterator<Integer> iterator = list.listIterator(start);
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number + " ");
        }
    }
}