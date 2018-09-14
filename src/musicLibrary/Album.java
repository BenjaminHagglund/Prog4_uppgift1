package musicLibrary;

import java.util.List;

public abstract class Album extends Library{

    String name;
    List<Song> songList;
    List<Album> albumList;

    public Album(String name) {
        super();
        this.name = name;
    }

    @Override
    void newAlbum(Album addAlbumTo) {

    }


    @Override
    void deleteAlbum(Album album) {

    }

    @Override
    void addSong(Album addingToAlbum, Song song) {

    }

    @Override
    void deleteSong(Song song) {

    }



}

