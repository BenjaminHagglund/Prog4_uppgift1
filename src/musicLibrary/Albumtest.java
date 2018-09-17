package musicLibrary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Albumtest {

	@Test
	void test() {
		Song test = new Song();
		test.setArtist("Metalica");
		String output = test.getArtistName();
		AssertEquals("Metalica",output);
	}

}
