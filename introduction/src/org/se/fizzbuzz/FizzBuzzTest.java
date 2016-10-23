package org.se.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		String actual = FizzBuzz.getFirstN(15);
		String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, " + "Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz";
		assertEquals(actual, expected);
	}

}
