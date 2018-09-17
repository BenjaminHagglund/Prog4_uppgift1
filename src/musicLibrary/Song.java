package musicLibrary;

import java.util.List;

public class Song extends Album {

    String name;
    String artistName;

    // Empty constructor
    public Song() {
        super();
    }

    // Setting song name
    public void setName(String name) {
        this.name = name;
    }

    // Setting artist name
    public void setArtist(String artistName) {
        this.artistName = artistName;
    }

    // Getting song name
    public String getName() {
        return name;
    }

    // Getting artist name
    public String getArtistName() {
        return artistName;
    }
}
