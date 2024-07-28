package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;

public class Challenge9 {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Bmw");
        cars.add("Audi");
        cars.add("Tesla");

        List<String> vehicle = new ArrayList<>();
        vehicle.addAll(cars);
        System.out.println(vehicle);
        System.out.println(cars.equals(vehicle));
    }
}