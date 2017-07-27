package tr.org.linux.kamp.oop;

public class Bicycle {

	private int gear;
	private int speed;
	private int color;

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	public void ChangeSpeed(int speed) {
		this.speed += speed;
	}
	public void ChangeGear(int gear) {
		
			try {
				if(gear<0)
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Yanlış Değer");
			}
	}

}
