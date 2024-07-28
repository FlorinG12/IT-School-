package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge14 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("four");
        list.add("nine");
        System.out.println(list);

        list.set(2, "three");
        list.set(3, "four");
        System.out.println(list);
    }
}