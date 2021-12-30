package check;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting ();
		int result = test.square(5);
		assertEquals(25, result);
	}

}
