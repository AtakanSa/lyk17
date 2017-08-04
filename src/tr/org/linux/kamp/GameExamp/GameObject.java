package tr.org.linux.kamp.GameExamp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * 
 * @author atakan
 **
 */


/**
 * 
 * @author atakan
 *Base class for every gameObject in game.Player,chips,enemies and mines are created from this class.
 *@param x for objects x coordinate
 *@param y for objects y coordinate
 *@param radius for objects size
 *@param speed for objects movement speed
 *@param color for color
 */
public abstract class GameObject {
	private int x;
	private int y;
	private int radius,speed;
	private Color color;
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
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param radius
	 * @param color
	 * @param speed
	 * our constructor class.Takes first values when object creating
	 */
		public GameObject(int x, int y, int radius, Color color,int speed) {
		super();
		this.speed = speed;
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
		/**
		 * 
		 * @param g2d for gameObject we need to draw on screen
		 */
	public void Draw(Graphics2D g2d) {
		g2d.setColor(getColor());
		g2d.fillOval(getX(), getY(), getRadius(), getRadius());
	}
	
	/**
	 * Using this class for  checking collisions.Getting Coordinates and Size.
	 * @return
	 */
	public Rectangle getRectangle() {
		Rectangle rect = new Rectangle(getX(),getY(),getRadius(),getRadius());
		return rect;
	}

}
