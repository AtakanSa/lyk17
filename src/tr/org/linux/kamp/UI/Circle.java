package tr.org.linux.kamp.UI;

import java.awt.Color;

public class Circle {
	private int x;
	private int y;
	private int radius;
	private Color color;
	
	public Circle(Color color) {
		x=0;
		y=0;
		radius=100;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
