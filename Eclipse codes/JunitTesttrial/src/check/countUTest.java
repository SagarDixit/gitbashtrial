package check;

import static org.junit.Assert.*;

import org.junit.Test;

public class countUTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting ();
		int varify = test.countU("Ulluu");
		assertEquals(3, varify);
	}

}
