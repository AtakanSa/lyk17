package tr.org.linux.kamp.car;

public class CarFactory {

	
	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setBrand("Ferrari");
		car1.setGear(6);
		car1.setSpeed(200);
		
		
		
		System.out.println("Brand :"+car1.getBrand());
		System.out.println("Gear :"+car1.getGear());
		System.out.println("Speed :"+car1.getSpeed());
		
		car1.changeGear(7);
		
		System.out.println("Gear :"+car1.getGear());
		
		car1.speedUp(20);
		
		System.out.println("Speed :"+ car1.getSpeed());
		
		car1.speedDown(100);
		
		System.out.println("Speed :"+ car1.getSpeed());
		
	}

	
	
}
