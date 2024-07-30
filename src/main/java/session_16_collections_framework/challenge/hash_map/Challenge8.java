package session_16_collections_framework.challenge.hash_map;

import java.util.HashMap;

public class Challenge8 {

    public static void main(String[] args) {
        HashMap<String, String> vehicleFuelType = new HashMap<>();
        vehicleFuelType.put("Ferrari", "gasoline");
        vehicleFuelType.put("Bmw", "diesel");
        vehicleFuelType.put("Tesla", "electricity");

        System.out.println(vehicleFuelType.containsValue("diesel"));
    }
}
