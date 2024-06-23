package session_6_core_apis.challenge;

public class Challenge3 {

    public static void main(String[] args) {
        String[] stringList = {"Hello and  welcome everyone. "};
        StringBuilder sb = new StringBuilder();
        for (String str : stringList) {
            sb.append(str).append("My ").append("name ").append(" is").append(" Dwayne!");
        }
        System.out.println(sb);
    }
}

