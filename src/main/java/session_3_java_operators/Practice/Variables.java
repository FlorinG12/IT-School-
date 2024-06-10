package session_3_java_operators.Practice;

public class Variables {

    public static void main(String[] args) {
        int age;
        age = 26;

        int value = 10;
        int outerVariables = 100;
        if (outerVariables > 50) {
            int innerVariable = 200;
            System.out.println(innerVariable + outerVariables);
        }
    }
}
