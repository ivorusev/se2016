package org.se.oop.encapsulation.figures;

public class Rectangle extends Square {

	private int height;

	public Rectangle(int startX, int startY, int width, int height) {
		super(startX, startY, width);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + System.lineSeparator() + " Height: " + height;
	}

}
