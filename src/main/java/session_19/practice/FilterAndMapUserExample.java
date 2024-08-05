package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class FilterAndMapUserExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Robin", "Will", 26),
                new User("Kevin", "Hearth", 29),
                new User("Arnold", "Marker", 31)
        );

        //filter users older than 27 and to their first name
        List<String> results = users.stream()
                .filter(user -> user.getAge() > 27)
                .map(User::getFirstName)
                .toList();

        System.out.println(results);
    }
}