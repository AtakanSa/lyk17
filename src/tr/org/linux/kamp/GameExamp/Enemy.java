package tr.org.linux.kamp.GameExamp;

import java.awt.Color;

public class Enemy extends GameObject {

	public Enemy(int x, int y, int radius, Color color, int speed) {
		super(x, y, radius, color, speed);

		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setRadius(int radius) {
		if(getRadius()+ radius>10 && getRadius() + radius<250) {
			setRadius(getRadius() + radius);
			super.setRadius(radius);
		}
		
	}

}
