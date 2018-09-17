package maintest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.jupiter.api.Test;

import musicLibrary.Album;
import musicLibrary.SoundClip;

class LibraryTest {
	String artist = "metallica";
	File file = new File("inFile");
	SoundClip test = new SoundClip(file);
	
	Album album = new Album("Best Of Metallica");
	
	
	@Test
	void getsetNametest() {
		test.setName("metallica");
		String output = test.getName();
		assertEquals("metallica",output);
	}
	
	@Test
	void getsetArtisttest() {
		test.setArtist(artist);
		assertEquals("metallica",test.getArtistName());
	}
	
	@Test
	void getFiletest() {
		assertTrue(test.getFile() != null);
	}
	
	@Test
	void toStringtest() {
		assertEquals("inFile",test.toString());
	}
	@Test
	void equalstest() {
		File file2 = new File("inFile2");
		SoundClip test2 = new SoundClip(file2);
		assertFalse(test.equals(test2));
		assertTrue(test.equals(test));
	}
	@Test
	void hashCodetest() {
		File file2 = new File("inFile2");
		assertTrue(test.hashCode() < 0);
	}
	
}  
