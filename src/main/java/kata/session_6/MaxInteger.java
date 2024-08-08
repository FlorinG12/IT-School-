package kata.session_6;

import java.util.*;

public class MaxInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the first number");
        list.add(scanner.nextInt());
        System.out.println("Enter the first number");
        list.add(scanner.nextInt());
        System.out.println("Enter the first number");
        list.add(scanner.nextInt());

        Collections.sort(list);

        System.out.println(list.get(list.size() - 1));
    }
}