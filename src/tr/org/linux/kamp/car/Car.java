package tr.org.linux.kamp.car;

public class Car {

	private int gear;
	private int speed;
	private String brand;
	public Car() {
		
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSpeed() {
		return speed;
	}
	public int getGear() {
		return gear;
	}
	public String getBrand() {
		return brand;
	}
	
	public void speedUp(int inc) {
		speed+=inc;
	}
	
	public void speedDown(int dec) {
		speed -= dec;
	}
	
	public void changeGear(int gear) {
		this.gear = gear;
	}
	
	
}
