package session_6_core_apis.challenge;

public class Challenge5 {

    public static void main(String[] args) {
        String sentence = "I love to code ";
         String result = capitalizesWords(sentence );
        System.out.println(result);

    }

    public static String capitalizesWords(String st) {
        StringBuilder sb = new StringBuilder();
        boolean capsNext = true;

        for (char ch : st.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                capsNext = true;
                sb.append(ch);
            } else if (capsNext) {
                sb.append(Character.toUpperCase(ch));
                capsNext = false;
            }else {
                sb.append(ch);
            }
        }


        return sb.toString();
    }
}
