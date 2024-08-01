package session_17_equals_hashcode_generics.challenge.challenge_4;

import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private double length;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != getClass()) return false;
        Song song = (Song) o;
        return title.equals(song.title) && Objects.equals(artist, song.artist);
    }
    @Override
    public  int hashCode(){
        return Objects.hash(title,artist);
    }
}