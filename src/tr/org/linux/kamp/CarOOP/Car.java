package tr.org.linux.kamp.CarOOP;

public class Car extends Vehicle implements Driveable {

	public Car(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAutoPilot, gasType gasType) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofoil, hasAutoPilot, gasType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excuteMotor() {
		System.out.println("Motor Executed");
		
	}

	@Override
	public void processGas() {
		System.out.println("Gaz Verildi !");
		
	}

	


}
