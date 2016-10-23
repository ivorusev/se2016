package org.se.sumator;

/**
 * Class that has methods for summing real or whole numbers.
 * 
 * @author vsr
 *
 */
public class Sumator {

	/**
	 * Sums two whole numbers.
	 * 
	 * @param numberA
	 *            first number
	 * @param numberB
	 *            second number
	 * @return the sum
	 */
	public static int sum(int numberA, int numberB) {
		return numberA + numberB;
	}

	/**
	 * Sums two real numbers.
	 * 
	 * @param f
	 *            first number
	 * @param g
	 *            second number
	 * @return result
	 */
	public static float sum(float f, float g) {
		return f + g;
	}

}
