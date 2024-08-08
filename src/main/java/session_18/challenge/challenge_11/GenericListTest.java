package session_18.challenge.challenge_11;

import java.util.Arrays;
import java.util.List;

public class GenericListTest {

    public static void main(String[] args) {
        GenericList<String> stringCheck = (list, element) -> list.contains(element);
        GenericList<Integer> integerCheck = (list, element) -> list.contains(element);

        List<String> stringList = Arrays.asList("Ford", "Bmw", "Romania");
        boolean isElement = stringCheck.contain(stringList, "Romania");
        boolean isElement2 = stringCheck.contain(stringList, "Audi");

        List<Integer> integerList = Arrays.asList(1, -15, 55, 72);
        boolean isNegativeNumber = integerCheck.contain(integerList, -1);
        boolean isNegativeNumber1 = integerCheck.contain(integerList, 72);

        System.out.println("This list " + stringList + " contain  Romania ? " + isElement);
        System.out.println("This list " + stringList + " contain  Audi ? " + isElement2);

        System.out.println("This list " + integerList + " contain a -1 ? " + isNegativeNumber);
        System.out.println("This list " + integerList + " contain a 72 ? " + isNegativeNumber1);
    }
}