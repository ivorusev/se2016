package org.se.oop.rightturner;

import static org.junit.Assert.*;

import org.junit.Test;

import kareltherobot.Directions;
import kareltherobot.World;

/**
 * Test for {@link RightTurnerRobot}
 * 
 * @author vsr
 *
 */
public class RightTurnerRobotTest {

	@Test
	public void test() {
		World.setSize(10, 10);
		World.setDelay(50);
		World.setVisible();
		RightTurnerRobot rightTurner = new RightTurnerRobot(5, 5, Directions.North);
		rightTurner.turnRight();
		assertTrue(rightTurner.facingEast());
	}

}
