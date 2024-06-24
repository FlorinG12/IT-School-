package session_7_utility_classes.practice;

public class MainStudent {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Arnold";
        student1.age = 25;

        Student student2 = new Student();
        student2.name = "Arnold";
        student2.age = 25;
        System.out.println(student1.equals(student2));
    }
}
