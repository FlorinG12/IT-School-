package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;

public class Challenge18 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first element");
        list.add("second element");

        if (list.isEmpty()){
            System.out.println("List has no elements");
        }else {
            System.out.println("Your list has "+list.size()+" elements : "+list );
        }
    }
}