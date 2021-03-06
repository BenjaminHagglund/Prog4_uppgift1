package musicLibrary;

import java.util.List;

public abstract class Library {

    private List<SoundClip> rootSongList;
    private List<Album> rootAlbumList;


    public Library() {
        // Empty Constructor
    }

    /*
    Initialize Constructor
    Input: Imported Albums list and imported Song list
    */
    public Library(List<SoundClip> rootSongList, List<Album> rootAlbumList) {
        this.rootSongList = rootSongList;
        this.rootAlbumList = rootAlbumList;
    }

    /*
    Creating a new album
    Input: String of album name and head album were the new album will be created
    */
    public abstract void newAlbum(String name, Album album);

    /*
    Deleting album and moving content to head album.
    Input: Album to be deleted
     */
    public abstract void deleteAlbum(Album album);

    /*
    Adding song to album
    Input: Album that song will be added to and Song that will be added
     */
    public abstract void addSong(Album addingToAlbum, SoundClip song );

    /*
    Deleting song
    Input: Song that you want deleted
     */
    public abstract void deleteSong(SoundClip song);

	public List<SoundClip> getRootSongList() {
		return rootSongList;
	}

	public void setRootSongList(List<SoundClip> rootSongList) {
		this.rootSongList = rootSongList;
	}

	public List<Album> getRootAlbumList() {
		return rootAlbumList;
	}

	public void setRootAlbumList(List<Album> rootAlbumList) {
		this.rootAlbumList = rootAlbumList;
	}

    
}
