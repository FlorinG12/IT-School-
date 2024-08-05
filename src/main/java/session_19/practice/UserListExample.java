package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class UserListExample {

    public static void main(String[] args) {
        List<User>users = Arrays.asList(
                new User("Robin", "Will",26),
                new User("Kevin", "Hearth",29),
                new User("Arnold", "Marker",31)
        );
        //all user  without stream
        users.forEach(System.out::println);

        //all user with stream
        users.stream().forEach(System.out::println);
    }
}