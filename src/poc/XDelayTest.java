package poc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class XDelayTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("start");
		TimeUnit.SECONDS.sleep(3);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("FINISH");
	}

	@Test
	void testDelayedHello() {
		X x = new X();
		String ret = x.hello("First");
		System.out.println(ret);
		assertTrue(ret.equals("Hello First"));
	}
	@Test
	void testDelayedHello2() {
		X x = new X();
		String ret = x.hello("Second");
		System.out.println(ret);
		assertTrue(ret.equals("Hello Second"));
	}

}
