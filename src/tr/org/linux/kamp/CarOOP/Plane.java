package tr.org.linux.kamp.CarOOP;

public class Plane extends Vehicle implements Driveable {

	private int maximumFeet;
	private boolean isAutoPilotActive;
	private liftOffType type;
	
	
	public Plane(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAutoPilot, gasType gasType) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofoil, hasAutoPilot, gasType);
		// TODO Auto-generated constructor stub
	}

	public int getMaximumFeet() {
		return maximumFeet;
	}

	public void setMaximumFeet(int maximumFeet) {
		this.maximumFeet = maximumFeet;
	}

	public boolean isAutoPilotActive() {
		return isAutoPilotActive;
	}

	public void setAutoPilotActive(boolean isAutoPilotActive) {
		this.isAutoPilotActive = isAutoPilotActive;
	}

	public liftOffType getType() {
		return type;
	}

	public void setType(liftOffType type) {
		this.type = type;
	}

	@Override
	public void excuteMotor() {
		System.out.println("Motor Executed");
		
	}

	@Override
	public void processGas() {
		System.out.println("Gaz Verildi");
		
	}

	
	public void liftOffType(liftOffType type) {
		this.type = type;
	}
	
	public String liftOffMessage() {
		return String.valueOf(type);
	}
	
	

}
