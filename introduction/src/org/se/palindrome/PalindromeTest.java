package org.se.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testValidPandromCaseInsensitive() {
		boolean actual = Palindrome.testString("ABBa", false);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testValidPandromCaseSensitive() {
		boolean actual = Palindrome.testString("ABBA", true);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInvalidPandromCaseSensitive() {
		boolean actual = Palindrome.testString("ABBB", true);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInvalidPandromCaseInsensitive() {
		boolean actual = Palindrome.testString("ABBb", false);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test(expected = NullPointerException.class)
	public void testInvalidInput() {
		Palindrome.testString(null, false);
	}

}
