package musicLibrary;

import java.util.List;

public class Song extends Album {

    String name;
    String artist;

    public Song() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }
}
