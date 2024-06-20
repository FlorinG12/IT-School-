package session_6_core_apis.practice;

public class StringPractice {
    public static void main(String[] args) {
//        stringConcat();
//        System.out.println(getStringLength("BigAlice"));
//        System.out.println(getStringChar("Frank", 1));
//        System.out.println(isStringStartingWith("Hello", "Her"));
//        System.out.println("               Sparrow          ");
//        System.out.println(getTrimmedString("                 Sparrow      "));

        String sentence = "I like to watch movies";
sentence = sentence
        .trim()
        .replace( 'o', 'a')
        .toLowerCase();
        System.out.println(sentence);



    }
    public static String getTrimmedString(String  input){
        return input.trim();
    }

    public static boolean isStringStartingWith(String input, String startWith){
        return input.startsWith(startWith);
    }

    public static char getStringChar(String input, int index){
        return input.charAt(index);
    }

    public static int getStringLength(String input){
        return input.length();
    }

    public static void stringConcat() {
        String value1 = "Hello";
        String value2 = "World";

        System.out.println(value1 + value2);
        System.out.println(value1.concat(value2));

    }
}
