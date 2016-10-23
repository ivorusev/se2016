package org.se.oop.encapsulation.figures.robots;

import org.se.oop.encapsulation.figures.Figure;
import org.se.oop.encapsulation.figures.Rectangle;
import org.se.oop.rightturner.RightTurnerRobot;

import kareltherobot.Directions;

public class RectangleDrawer extends RightTurnerRobot implements Drawer {
	
	private Rectangle figure;

	public RectangleDrawer(Figure figure) {
		super(((Rectangle) figure).getStartX(), ((Rectangle) figure).getStartY(), Directions.North);
		this.figure = (Rectangle) figure;
	}
	
	@Override
	public void draw() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < figure.getHeight(); j++) {
				putBeeper();
				move();
			}
			turnRight();
			for (int j = 0; j < figure.getWidth(); j++) {
				putBeeper();
				move();
			}
			turnRight();
		}
	}
}
