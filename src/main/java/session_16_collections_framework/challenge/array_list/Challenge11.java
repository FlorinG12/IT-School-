package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge11 {

    public static void main(String[] args) {
        List<String> reverseList = new ArrayList<>();
        reverseList.add("hello");
        reverseList.add("everyone");

        Collections.reverse(reverseList);
        System.out.println(reverseList);
    }
}