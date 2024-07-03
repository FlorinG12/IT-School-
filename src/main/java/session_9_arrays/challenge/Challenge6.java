package session_9_arrays.challenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> studentsList = new LinkedList<>();
        studentsList.add("Alina");
        studentsList.add("Alex");
        studentsList.add("Florin");
        studentsList.add("Radu");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        if (studentsList.contains(name)) {
            studentsList.remove(name);
            System.out.println("The name " + name + " has been removed  from the list ");
        } else {
            System.out.println("Your name is not on the list");
        }

        System.out.println("Students list " + studentsList);
    }
}
