package org.se.oop.rightturner;

import kareltherobot.Robot;

/**
 * Robot that has the capability to turn right.
 * 
 * @author vsr
 *
 */
public class RightTurnerRobot extends Robot {

	/**
	 * Constructs a new robot.
	 * 
	 * @param street
	 *            x coordinate
	 * @param avenue
	 *            y coordinate
	 * @param direction
	 *            see {@link Direction}
	 */
	public RightTurnerRobot(int street, int avenue, Direction direction) {
		super(street, avenue, direction, 100);
	}

	/**
	 * Turns the robot right.
	 */
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

}
