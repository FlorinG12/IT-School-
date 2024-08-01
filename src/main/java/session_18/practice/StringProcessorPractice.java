package session_18.practice;

public class StringProcessorPractice {

    public static void main(String[] args) {
        StringProcessor removeWhiteSpaces = str -> str.replace(" ", "");
        StringProcessor tpUpperCase = str -> str.toUpperCase();

        StringProcessor combined = removeWhiteSpaces.andThen(tpUpperCase);
        System.out.println(combined.processor("  Hello    World"));
    }
}