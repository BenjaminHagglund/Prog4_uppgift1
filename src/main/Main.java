package main;

import musicLibrary.Album;
import musicLibrary.Song;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Program");

        Album rootAlbum = new Album();

        Song song_1 = new Song();
        Song song_2 = new Song();
        Song song_3 = new Song();

        rootAlbum.addSong(rootAlbum,song_1);
        rootAlbum.addSong(rootAlbum,song_2);
        rootAlbum.addSong(rootAlbum,song_3);

        System.out.println("End of Program");
    }// END

}
