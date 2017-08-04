package tr.org.linux.kamp.GameExamp;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;

public class Player extends GameObject {

	private String name;

	/**
	 * 
	 * @param x
	 *            for coordinate from upper class(GameObject)
	 * @param y
	 *            for coordinate from upper class(GameObject)
	 * @param radius
	 *            player's size from upper class
	 * @param color
	 * @param speed
	 * @param name
	 */
	public Player(int x, int y, int radius, Color color, int speed, String name) {
		super(x, y, radius, color, speed);
		this.name = name;
		System.out.println(name);
		// TODO Auto-generated constructor stub
	}

	public void getRectangleArea() {

	}

	/**
	 * sets player's size. it cant reach minimum and maximum size
	 */

	@Override
	public void setRadius(int radius) {
		if (getRadius() + radius > 10 && getRadius() + radius < 250) {
			setRadius(getRadius() + radius);
			super.setRadius(radius);
		}

	}

	/**
	 * overriding draw method for drawing our player's name on screen
	 */
	@Override
	public void Draw(Graphics2D g2d) {
		FontMetrics fontMetrics = g2d.getFontMetrics(g2d.getFont());
		int width = fontMetrics.stringWidth(name);
		int nameX = getX() + (getRadius() - width) / 2;
		int nameY = getY() - fontMetrics.getHeight();
		g2d.drawString(name, nameX, nameY);
		super.Draw(g2d);
	}

}
