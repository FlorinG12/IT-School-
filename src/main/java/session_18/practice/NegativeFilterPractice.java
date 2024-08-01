package session_18.practice;

import java.util.List;

public class NegativeFilterPractice {

    public static void main(String[] args) {
        NegativeFilter negativeFilter = numbers -> numbers.stream()
                .filter(num -> num < 0)
                .toList();

        List<Integer> numbers = List.of(12, -1, 41, -10);
        System.out.println(negativeFilter.filter(numbers));
    }
}