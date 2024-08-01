package session_17_equals_hashcode_generics.challenge.challenge_3;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student("Marcus", "Carl", 25, "m.carl@university.com");
        Student newStudent = new Student("Marcus", "Carl", 25, "m.carl@university.com");

        System.out.println("Student is equal with new Student? " + student.equals(newStudent));
        System.out.println(student);
    }
}