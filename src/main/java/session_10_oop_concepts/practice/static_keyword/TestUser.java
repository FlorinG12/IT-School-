package session_10_oop_concepts.practice.static_keyword;

public class TestUser {

    public static void main(String[] args) {

        User user1 = new User();
        user1.setFirstName("Robin");
        user1.setLastName("Hood");
        user1.setAge(39);

        System.out.println(user1.getLastName());
    }
}
