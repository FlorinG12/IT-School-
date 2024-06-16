package session_4_java_operators_and_loops.challenges;

public class Challenge7 {
    public static void main(String[] args) {
        double sideOne = 10;
        double sideTwo = 20;
        double sideThree = 10;
        String triangle = (sideOne == sideTwo && sideTwo == sideThree) ? "Equlateral" :
                (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) ? "Isoscel" : "Scalene";
        System.out.println("The triangle is : " + triangle);
    }
}
