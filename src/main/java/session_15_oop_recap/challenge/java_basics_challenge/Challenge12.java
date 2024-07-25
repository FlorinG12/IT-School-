package session_15_oop_recap.challenge.java_basics_challenge;

public class Challenge12 {
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    String stringVar;

    public static void main(String[] args) {
        Challenge12 ch = new Challenge12();
        ch.printDefault();
    }

    public void printDefault() {
        System.out.println("Default value of byte: " + byteVar);
        System.out.println("Default value of short: " + shortVar);
        System.out.println("Default value of int: " + intVar);
        System.out.println("Default value of long: " + longVar);
        System.out.println("Default value of float: " + floatVar);
        System.out.println("Default value of double: " + doubleVar);
        System.out.println("Default value of char: " + charVar);
        System.out.println("Default value of boolean: " + booleanVar);
        System.out.println("Default value of String (Object): " + stringVar);
    }
}