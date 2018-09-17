package maintest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import musicLibrary.SoundClip;

class LibraryTest {
	String artist = "metallica";
	
	@Test
	void getNametest() {
		SoundClip test = new SoundClip(null);
		test.setName("metallica");
		String output = test.getName();
		assertEquals("metallica",output);
	}

}
