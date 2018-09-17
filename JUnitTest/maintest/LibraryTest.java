package maintest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import musicLibrary.Album;
import musicLibrary.Song;

class LibraryTest {
	String artist = "metallica";
	
	@Test
	void getNametest() {
		Song test = new Song();
		test.setName("metallica");
		String output = test.getName();
		assertEquals("metallica",output);
	}
	@Test
	void newAlbumtest() {
		Album rootAlbum = new Album();
		Library.newAlbum()
	}

}
