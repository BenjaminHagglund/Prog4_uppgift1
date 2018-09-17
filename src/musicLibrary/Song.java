package musicLibrary;

import java.util.List;

public class Song extends Album {

    private String name;
    private String artist;

    public Song() {
    	super();
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
