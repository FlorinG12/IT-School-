package session_15_oop_recap.challenge.java_basics_challenge;

import java.util.SortedMap;

public class Challenge11 {
    public String instanceVar = "instance";
    public static String staticVar = "static";

    public void localScope() {
        String hello = "Hello World";
        System.out.println("Local  " + hello);

        System.out.println(instanceVar);
        System.out.println(staticVar);
    }

    public static void main(String[] args) {
        System.out.println(staticVar);
    }
}