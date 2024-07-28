package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge19 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(2);
        list.add(4);
        System.out.println(list.size());

        list.trimToSize();
        System.out.println(list.size());
    }
}