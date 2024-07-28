package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge20 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(12);
        System.out.println(list.size());
        list.ensureCapacity(50);
        System.out.println(list.size());
    }
}