package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.List;

public class Challenge3 {

    public static void main(String[] args) {

        List<String> studentList = new ArrayList<>();
        List<String> graduateStudentList = new ArrayList<>();
        studentList.add("John");
        studentList.add("Mark");
        studentList.add("Al");
        studentList.add("Robin");
        studentList.add("Maria");
        studentList.add("Arnold");
        studentList.add("Suzie");
        studentList.add("Alina");
        studentList.add("Arthur");
        studentList.add("Dwayne");

        graduateStudentList.addAll(studentList);

        for (String student : graduateStudentList) {
            System.out.println(student);
        }
        System.out.println("");
        System.out.println(studentList.equals(graduateStudentList));

    }
}
