package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class MapUserFullNameExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Robin", "Will", 26),
                new User("Kevin", "Hearth", 29),
                new User("Arnold", "Marker", 31)
        );

        //map users to their full name and collect into a list
        List<String> fullNames = users.stream()
                .map(name -> name.getFirstName() + " " + name.getLastName())
                .toList();
        System.out.println(fullNames);
    }
}