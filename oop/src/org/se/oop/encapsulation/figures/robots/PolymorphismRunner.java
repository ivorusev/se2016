package org.se.oop.encapsulation.figures.robots;

import java.util.ArrayList;
import java.util.List;

import org.se.oop.encapsulation.figures.Rectangle;
import org.se.oop.encapsulation.figures.Square;

import kareltherobot.World;

public class PolymorphismRunner {

	public static void main(String[] args) {
		World.setSize(40, 40);
		World.setDelay(20);
		World.setVisible();
		List<Drawer> robots = new ArrayList<>();
		
		Drawer s1 = new SquareDrawer(new Square(5, 5, 3));
		Drawer r1 = new RectangleDrawer(new Rectangle(10, 10, 3, 5));
		Drawer r2 = new RectangleDrawer(new Rectangle(20, 20, 3, 5));
		Drawer s2 = new SquareDrawer(new Square(3, 3, 3));
		
		robots.add(s1);
		robots.add(s2);
		robots.add(r1);
		robots.add(r2);
		
		for (Drawer drawer : robots) {
			drawer.draw();
		}
	}

}
