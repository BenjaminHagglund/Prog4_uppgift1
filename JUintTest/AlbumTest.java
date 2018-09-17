import musicLibrary.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

    @Test
    void test() {
        Song test = new Song();
        test.setArtist("Metalica");
        String output = test.getArtistName();
        assertEquals("Metalica",output);
    }
}
