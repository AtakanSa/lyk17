package tr.org.linux.kamp.GameExamp;

import java.awt.Color;

public class Player extends GameObject{

	private int speed;
	
	public Player(int x, int y, int radius, Color color) {
		super(x, y, radius, color);
		// TODO Auto-generated constructor stub
	}
	
	public void getRectangleArea() {
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
