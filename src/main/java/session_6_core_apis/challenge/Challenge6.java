package session_6_core_apis.challenge;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "The cat sat on the mat";
        System.out.println("This is the sentence: " +sentence );
        System.out.println(" ");
        System.out.println("Enter the word what you want to be replaced");
        String oldMessage = scanner.nextLine();
        System.out.println("Enter the new word");
        String newMessage = scanner.nextLine();

        String result = replaceWord(sentence,oldMessage,newMessage);
        System.out.println(result);

    }

    public static String replaceWord(String sentence, String oldMessage, String newMessage) {
        StringBuilder sb = new StringBuilder(sentence);
        int index = sb.indexOf(oldMessage);

        while (index != -1){
            sb.replace(index, index+oldMessage.length(),newMessage);
            index += newMessage.length();
            index = sb.indexOf(oldMessage, index);
        }
        return sb.toString();
    }
}
