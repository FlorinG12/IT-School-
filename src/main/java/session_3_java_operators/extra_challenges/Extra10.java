package session_3_java_operators.extra_challenges;

import java.util.Scanner;

public class Extra10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String food1 = "Omleta ";
        double calories1 = 350;
        String food2 = "Paste bolongnese";
        double calories2 = 850;
        String food3 = "Salata cezar";
        double calories3 = 130;
        double caloriesTotal = calories1 + calories2 + calories3;
        System.out.println("Today you ate a total of " + caloriesTotal + " Kcal");
    }
}
