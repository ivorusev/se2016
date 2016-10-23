/**
 * 
 */
package org.se.palindrome;

/**
 * @author vsr
 *
 */
public class Palindrome {

	public static boolean testString(String input, boolean isCaseSensitive) {
		String tmp = input;
		if (!isCaseSensitive) {
			tmp = input.toLowerCase();
		}
		for (int i = 0; i < (tmp.length() - 1) / 2; i++) {
			char leftChar = tmp.charAt(i);
			char rightChar = tmp.charAt(tmp.length() - 1 - i);
			if (leftChar != rightChar) {
				return false;
			}
		}
		return true;
	}

}
