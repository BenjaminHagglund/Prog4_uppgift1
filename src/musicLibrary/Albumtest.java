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
		test.setName("metallica");
		String output = test.getName();
		assertEquals("metallica",output);

	}

}
