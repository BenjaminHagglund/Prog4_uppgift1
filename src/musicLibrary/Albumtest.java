package musicLibrary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Albumtest {

	@Test
	void test() {
		Song test = new Song();
		String output = test.getArtist();
		AssertEquals(asfdairf,output);
	}

}
