package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge16 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            list.add(index);
        }
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>(list);
        System.out.println(list1);
    }
}