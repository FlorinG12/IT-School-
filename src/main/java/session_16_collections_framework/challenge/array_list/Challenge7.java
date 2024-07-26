package session_16_collections_framework.challenge.array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pcComponents = new ArrayList<>();
        pcComponents.add("Memory RAM");
        pcComponents.add("SSD");
        pcComponents.add("GPU Graphics Card");
        pcComponents.add("CPU");

        System.out.println("Search for an element: ");
        String searchElement = scanner.nextLine();

        if (pcComponents.contains(searchElement.toUpperCase())) {
            System.out.println(searchElement + " --- was found in the list");
        } else {
            System.out.println("No element found in the list");
        }
    }
}