package session_10_oop_concept.challenge.challenge1;

public class CollegeManagement {

    public static void main(String[] args) {
        StudentProfile student = new StudentProfile("Sorab", "Ahmet", 22, "Male", "1995-12-24", 1941332212451L, "Turkey, River str mr 145 ");
        StudentProfile professor = new StudentProfile("Rocky", "Balboa", 40, "Male", "1980-10-04", 184566212451L, "Turkey, River str mr 145 ");

        Courses math = new Courses("1h:50min", "Monday 08am", "Math Courses");
        System.out.println(math.description + " " + math.schedule + " " + math.duration + " " + professor.firstName + " " + professor.lastName);

        Courses biology = new Courses("1h:50min", "Monday 10am", "Biology Courses");
        System.out.println(biology.description + " " + biology.schedule + " " + biology.duration + " " + professor.firstName + " " + professor.lastName);
    }

}
