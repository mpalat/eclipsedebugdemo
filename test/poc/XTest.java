package poc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class XTest {

	@Test
	void testHello() {
		X x = new X();
		String ret = x.hello("Junit");
		assertTrue(ret.equals("Hello Junit"));

//		ret = x.hello("Junit");
//		assertTrue(ret.equals("Changed Junit"));
	}
}
