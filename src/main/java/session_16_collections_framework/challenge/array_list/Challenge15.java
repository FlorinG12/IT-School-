package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge15 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("f101");
        list.add("f102");
        list.add("f103");
        System.out.println(list);
        System.out.println(list.size());

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("f105");
        list1.add("f106");
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list.size());
    }
}