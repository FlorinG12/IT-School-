package session_4_java_operators_and_loops.challenges;

import java.util.SortedMap;

public class Challenge17 {
    public static void main(String[] args) {
        boolean hasUsername = false;
        boolean hasPassword = false;
                                     //LOGICAL OPERATORS

        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (!hasUsername || !hasPassword) {
            if (hasUsername && !hasPassword) {
                System.out.println("Password is incorrect");
            } else {
                System.out.println("Authentication failed");
            }
                                      //TERNARY OPERATORS

//        String authentication = (hasUsername && hasPassword) ? "Authentication Success" :(hasUsername && !hasPassword) ? "Password is incorrect" :"Authentication Failed";
//        System.out.println(authentication);
        }
    }
}
