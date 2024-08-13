package session_20_recap.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Problem3 {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(-1);
        myList.add(17);
        myList.add(42);

        Optional<Integer> min = myList.stream().min(Integer::compareTo);
        min.ifPresent(System.out::println);

        Optional<Integer> max = myList.stream().max(Integer::compareTo);
        min.ifPresent(System.out::println);
    }
}