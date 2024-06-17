package session_4_java_operators_and_loops.challenges;

import java.util.ArrayList;

public class Challenge10 {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Marco");
        listOne.add("Polo");
        listOne.add("Fruits");

        ArrayList<String> listTwo = listOne;
        listOne.add("15");
        listTwo.add("Age");

        System.out.println("The first array list is : " +listOne);
        System.out.println("The second array list is : "+listTwo);
    }
}
