package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge6 {

    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        groceries.add("milk");
        groceries.add("eggs");
        groceries.add("meat");

        System.out.println(groceries);
        groceries.remove(2);
        System.out.println(groceries);
    }
}