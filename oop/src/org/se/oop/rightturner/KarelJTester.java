/**
 * 
 */
package org.se.oop.rightturner;

import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;

/**
 * @author vsr
 *
 */
public class KarelJTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		World.setSize(10, 10);
		World.setVisible();
		World.setDelay(20);
		
		Robot ivo = new Robot(1, 1, Directions.East, 100);
		ivo.move();
		ivo.putBeeper();
		ivo.move();
		ivo.putBeeper();
		ivo.move();
		ivo.turnLeft();
		ivo.turnLeft();
		ivo.turnLeft();
	}

}
