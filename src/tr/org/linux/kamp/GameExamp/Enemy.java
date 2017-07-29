package tr.org.linux.kamp.GameExamp;

import java.awt.Color;

public class Enemy extends GameObject{

	private int speed;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Enemy(int x, int y, int radius, Color color) {
		super(x, y, radius, color);
		// TODO Auto-generated constructor stub
	}

}
