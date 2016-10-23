/**
 * 
 */
package org.se.oop.encapsulation;

/**
 * @author vsr
 *
 */
public class Person extends AbstractTest {

	public int age;

	private String name;

	boolean isMale;

	protected String address;

	public Person(int age, String name, boolean isMale, String address) {
		this.age = age;
		this.name = name;
		this.isMale = isMale;
		this.address = address;
	}

	@Override
	public String toString() {
		return age + " " + name + " " + " " + isMale + " " + address;
	}

	@Override
	public void run() {
		System.out.println("I run.");
	}

}
