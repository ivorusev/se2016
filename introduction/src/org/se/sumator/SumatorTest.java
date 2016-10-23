package org.se.sumator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests {@link Sumator}.
 * 
 * @author vsr
 *
 */
public class SumatorTest {

	@Test
	public void testSumWholeNumber() {
		int actual = Sumator.sum(2, 2);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void testSumRealNumber() {
		float actual = Sumator.sum(2.0f, 2.0f);
		float expected = 4.0f;
		assertEquals(expected, actual, 0.1);
	}

}
