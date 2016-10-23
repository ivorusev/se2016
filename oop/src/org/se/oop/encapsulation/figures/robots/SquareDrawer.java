/**
 * 
 */
package org.se.oop.encapsulation.figures.robots;

import org.se.oop.encapsulation.figures.Figure;
import org.se.oop.encapsulation.figures.Square;
import org.se.oop.rightturner.RightTurnerRobot;

import kareltherobot.Directions;

/**
 * @author vsr
 *
 */
public class SquareDrawer extends RightTurnerRobot implements Drawer {
	
	private Square figure;
	
	public SquareDrawer(Figure figure) {
		super(((Square) figure).getStartX(), ((Square) figure).getStartY(), Directions.North);
		this.figure = (Square) figure;
	}
	
	@Override
	public void draw() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < figure.getWidth() - 1; j++) {
				putBeeper();
				move();
			}
			turnRight();
		}
	}

}
