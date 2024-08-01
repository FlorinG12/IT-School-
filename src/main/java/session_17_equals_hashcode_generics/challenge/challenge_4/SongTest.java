package session_17_equals_hashcode_generics.challenge.challenge_4;

public class SongTest {

    public static void main(String[] args) {
        Song song = new Song("Generator", "Dimension");
        Song newSong = new Song("Generator", "Dimension");

        if (song.equals(newSong) && song.hashCode() == newSong.hashCode()) {
            System.out.println("Objects are equal and have the same hashcode :" + song.hashCode() + " " + newSong.hashCode());
        } else {
            System.out.println(false);
        }
    }
}