package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bmw");
        list.add("Volvo");
        list.add("Audi");

        System.out.println(list.get(2));
        System.out.println(list.get(0));
    }
}