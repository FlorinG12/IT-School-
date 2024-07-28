package session_16_collections_framework.challenge.linked_list;

import java.util.Collections;
import java.util.LinkedList;

public class Challenge18 {

    public static void main(String[] args) {
        LinkedList<String> listMovies = new LinkedList<>();
        listMovies.add("Star Wars");
        listMovies.add("The Lord of The rings");
        listMovies.add("The Walking Dead");
        System.out.println(listMovies);

        LinkedList<String> anotherListMovies = new LinkedList<>(listMovies);
        System.out.println(anotherListMovies);
    }
}