package org.se.oop.encapsulation.figures.robots;

import static org.junit.Assert.*;

import org.junit.Test;
import org.se.oop.encapsulation.figures.Figure;
import org.se.oop.encapsulation.figures.Rectangle;
import org.se.oop.encapsulation.figures.Square;

import kareltherobot.Directions;
import kareltherobot.World;

public class FigureDrawersTest {

	// @Test
	public void testSquareDrawer() {
		World.setSize(20, 20);
		World.setDelay(0);
		Figure square = new Square(5, 5, 3);
		SquareDrawer drawer = new SquareDrawer(square);
		drawer.draw();
		// TODO assert coordinates
	}
	
	@Test
	public void testRectangleDrawer() {
		World.setSize(20, 20);
		World.setVisible();
		World.setDelay(30);
		Figure rectangle = new Rectangle(5, 5, 3, 5);
		RectangleDrawer drawer = new RectangleDrawer(rectangle);
		drawer.draw();
		// TODO assert coordinates
	}

}
