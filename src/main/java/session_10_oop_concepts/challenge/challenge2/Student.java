package session_10_oop_concepts.challenge.challenge2;

public class Student {
    private String id;
    private String firstName;
    private double grade;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Student(String id, String name, double grade) {
        this.id = id;
        this.firstName = firstName;
        this.grade = grade;
    }

    public static void String(int index, String str) {
        for (int a = 1; a <= 5; a++) {
            Student s = new Student("A00" + a, switch (a) {
                case 1 -> "Tom";
                case 2 -> "Jerry";
                case 3 -> "Jack";
                case 4 -> "Mack";
                case 5 -> "Rux";
                default -> "Unknown";
            });
            System.out.println("ID: " + s.id + " Name: " + s.firstName);
        }
    }
}
