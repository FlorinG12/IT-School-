package session_8_recap.practice;

public class CapitalizeFirstLetter {

    public static void main(String[] args) {

        String input = "apple,banana,watermelon,pear";
        String[] inputArray = input.split(",");

        StringBuilder sb = new StringBuilder();

        for (String value : inputArray) {
            sb.append(Character.toUpperCase(value.charAt(0)))
                    .append((value.substring(1)))
                    .append("\n");
        }
        System.out.println(sb);
    }
}
