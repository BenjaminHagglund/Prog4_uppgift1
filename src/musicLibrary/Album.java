package musicLibrary;

import java.util.List;

public class Album extends Library{

    String name;
    List<SoundClip> songList;
    List<Album> albumList;


    // Empty constructor
    public Album(){
        super();
    }

    // Constructor
    public Album(String name) {
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
    public void addSong(Album addingToAlbum, SoundClip song) {

    }

    // Method described in Library Class
    @Override
    public void deleteSong(SoundClip song) {

    }



}

