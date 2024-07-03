package session_9_arrays.challenge;

public class Challenge8 {

    public static void main(String[] args) {

        String [] movieList = {"Fast and Furious", "Mission Impossible", "Tokyo Drift", "Lord of the Rings"};
        String target = "Lord of the Rings";
        int position =linearSearch(movieList, target);

        if (position != -1){
            System.out.println("Movie  title found at position " + position);
        }else {
            System.out.println("Movie not found!!");
        }

    }

    public static int linearSearch(String[] movieTitle, String target) {

        for (int index = 1; index < movieTitle.length; index++) {
            if (movieTitle[index].equals(target)) {
                return index;
            }
        }
return -1;
    }
}
