package session_4_java_operators_and_loops.practice;

public class MemoryReference {

    public static void main(String[] args) {
        String greeting1 = "hello";
        String greeting2 = "Hello";
        String greeting3 = new String("Hello");

//        System.out.println(greeting1 == greeting2);
//        System.out.println(greeting1.equals(greeting2));

        User user1 = new User("Alex");
        User user2 = new User("Alex");
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}

class User {
    String firstName;

    public User(String firstNme) {
        this.firstName = firstNme;
    }
}
