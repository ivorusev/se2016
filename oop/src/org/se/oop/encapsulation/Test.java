/**
 * 
 */
package org.se.oop.encapsulation;

/**
 * @author vsr
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractTest ivan = new Person(20, "Ivan", true, "ul. 1");
		ivan.run();
		ivan.run(1);
	}

}
