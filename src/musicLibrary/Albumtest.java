package musicLibrary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Albumtest {
	//SONGTEST
	@Test
	void test() {
		Song test = new Song();
<<<<<<< HEAD
		test.setName("metallica");
		String output = test.getName();
		assertEquals("metallica",output);
=======
		test.setArtist("Metalica");
		String output = test.getArtistName();
		AssertEquals("Metalica",output);
>>>>>>> 882b4d53e7fed73db6df220b13b993e9dbd1a6f3
	}

}
