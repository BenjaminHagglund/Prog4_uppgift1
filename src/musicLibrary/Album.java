package musicLibrary;

import java.util.List;

public class Album extends Library{

    String name;
    List<Song> songList;
    List<Album> albumList;

<<<<<<< HEAD
    public Album() {
=======
    // Empty constructor
    public Album(){
        super();
    }

    // Constructor
    public Album(String name) {
>>>>>>> 882b4d53e7fed73db6df220b13b993e9dbd1a6f3
        super();
    }

    // Method described in Library Class
    @Override
    public void newAlbum(String name, Album album) {

    }

    // Method described in Library Class
    @Override
    public void deleteAlbum(Album album) {

    }

    // Method described in Library Class
    @Override
    public void addSong(Album addingToAlbum, Song song) {

    }

    // Method described in Library Class
    @Override
    public void deleteSong(Song song) {

    }



}

