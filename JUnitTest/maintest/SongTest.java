package maintest;

/*
 * Test for SoundClip Class
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import musicLibrary.SoundClip;

public class SongTest {
	
	@Test 
	void setGetSongNameTest() {
		SoundClip newSong = new SoundClip(null);
		newSong.setName("Song name");
		assertEquals("Song name", newSong.getName());
	}
	
	@Test 
	void setGetArtistTest() {
		SoundClip newSong = new SoundClip(null);
		newSong.setArtist("Artist Name");
		assertEquals("Artist Name", newSong.getArtistName());
	}
	
}
