package musicLibrary;

import java.util.List;

public abstract class Library {

    List<Song> rootSongList;
    List<Album> rootAlbumList;


    public Library() {
        // Empty Constructor
    }

    /*
    Initialize Constructor
    Input: Imported Albums list and imported Song list
    */
    public Library(List<Song> rootSongList, List<Album> rootAlbumList) {
        this.rootSongList = rootSongList;
        this.rootAlbumList = rootAlbumList;
    }


    /*
    Deleting album and moving content to head album.
    Input: Album to be deleted
     */
    public abstract void deleteAlbum(Album album);

    /*
    Adding song to album
    Input: Album that song will be added to and Song that will be added
     */
    public abstract void addSong(Album addingToAlbum, Song song );

    /*
    Deleting song
    Input: Song that you want deleted
     */
    public abstract void deleteSong(Song song);


}
