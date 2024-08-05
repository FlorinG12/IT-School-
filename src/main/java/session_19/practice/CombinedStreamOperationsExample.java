package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class CombinedStreamOperationsExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Robin", "Will", 26),
                new User("Kevin", "Hearth", 29),
                new User("Arnold", "Marker", 31)
        );
        //filter user younger than 27
        //map to full names
        //sort by last name
        //collect into a list

        List<String> resultList = users.stream()
                .filter(user -> user.getAge() < 27)
                .map(user -> user.getFirstName() + " " + user.getLastName())
                .sorted()
                .toList();

        System.out.println(resultList);
    }
}