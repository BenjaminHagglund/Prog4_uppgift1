package musicLibrary;

import java.util.List;

public abstract class Library {

    List<Song> rootSongList;
    List<Album> rootAlbumList;

    public Library() {
    }

    public Library(List<Song> rootSongList, List<Album> rootAlbumList) {
        this.rootSongList = rootSongList;
        this.rootAlbumList = rootAlbumList;
    }

    abstract void newAlbum(Album addAlbumTo);

    abstract void deleteAlbum(Album album);

    abstract void addSong(Album addingToAlbum, Song song );

    abstract void deleteSong(Song song);


}
