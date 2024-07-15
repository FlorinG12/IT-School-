package session_10_oop_concepts.challenge.challenge1;

public class Student {

    public String firstName;
    public String lastName;
    public int age;
    public enum gender {Male, Female, Other};
    private String dateOfBirth;
    private long CNP;
    private String address;

    public Student(String firstName, String lastName, int age,  String dateOfBirth, long CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.address = address;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getCNP() {
        return CNP;
    }

    public String getAddress() {
        return address;
    }
}
