package session_15_oop_recap.challenge.java_basics_challenge;

public class Challenge10 {
    public static final int NUMBER_OF_DAYS_IN_A_WEEK = 7;

    public static void main(String[] args) {
        addDays(9);
    }

    public static void addDays(int add) {
        if (add > NUMBER_OF_DAYS_IN_A_WEEK) {
            System.out.println("You add " + add + " days but the limit is " + NUMBER_OF_DAYS_IN_A_WEEK);
        } else {
            System.out.println("You are inside the limit of a week");
        }
    }
}