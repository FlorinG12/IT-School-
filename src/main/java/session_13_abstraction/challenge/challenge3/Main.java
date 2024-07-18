package session_13_abstraction.challenge.challenge3;

public class Main {

    public static void main(String[] args) {

        StudentA studentA = new StudentA(54,67,80);
        System.out.println(studentA.getPercentage());

        StudentB studentB = new StudentB(45,70,59,90);
        System.out.println(studentB.getPercentage());
    }
}
