/**
 * 
 */
package org.se.oop.encapsulation.figures;

/**
 * @author vsr
 *
 */
public class Square extends Figure {

	private int startX;
	private int startY;
	private int width;

	public Square(int startX, int startY, int width) {
		this.startX = startX;
		this.startY = startY;
		this.width = width;
	}

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Start X: ").append(startX).append(System.lineSeparator()).append("Start Y:").append(startY)
				.append(System.lineSeparator()).append("Width: ").append(width);
		return sb.toString();
	}
}
