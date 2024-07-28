package session_16_collections_framework.challenge.linked_list;

import java.util.LinkedList;

public class Challenge13 {

    public static void main(String[] args) {
        LinkedList<Integer> listNumbers = new LinkedList<>();
        listNumbers.add(-9);
        listNumbers.add(1);
        listNumbers.add(12);
        listNumbers.add(31);
        listNumbers.add(-14);

        System.out.println(listNumbers);
        System.out.println("List without first and last elements "+listNumbers.removeFirst()+listNumbers.removeLast());
        System.out.println(listNumbers);
    }
}