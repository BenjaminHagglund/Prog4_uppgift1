package musicLibrary;

import java.util.List;

public class Song extends Album {

<<<<<<< HEAD
    private String name;
    private String artist;
=======
    String name;
    String artistName;
>>>>>>> 882b4d53e7fed73db6df220b13b993e9dbd1a6f3

    // Empty constructor
    public Song() {
<<<<<<< HEAD
    	super();
=======
        super();
>>>>>>> 882b4d53e7fed73db6df220b13b993e9dbd1a6f3
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
