package session_5_advanced_flow_control.challenge;

public class Challenge9 {

    public static void main(String[] args) {
        int[] numbers = {12, 2, 4, 6, 1, 3, 7, 29};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " Even");
            } else {
                System.out.println(number + " Odd");
            }
        }
    }
}
