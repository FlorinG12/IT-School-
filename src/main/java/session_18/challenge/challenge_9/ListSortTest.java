package session_18.challenge.challenge_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortTest {

    public static void main(String[] args) {
        ListSort listSort = (number) -> number.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        List<Integer> num = Arrays.asList(1, 25, 55, 32, 12, 78, 43);
        List<Integer> oddNum = listSort.sortInt(num);

        System.out.println("List with all elements: " + num);
        System.out.println("List with odd numbers: " + oddNum);
    }
}