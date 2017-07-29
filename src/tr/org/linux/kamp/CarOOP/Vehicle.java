package tr.org.linux.kamp.CarOOP;

public abstract class Vehicle {

	public Vehicle(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAutoPilot, gasType gasType) {
		super();
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.capacity = capacity;
		this.numberOfWheels = numberOfWheels;
		this.hasAerofoil = hasAerofoil;
		this.hasAutoPilot = hasAutoPilot;
		this.gasType = gasType;
	}

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public boolean isHasAerofoil() {
		return hasAerofoil;
	}

	public void setHasAerofoil(boolean hasAerofoil) {
		this.hasAerofoil = hasAerofoil;
	}

	public boolean isHasAutoPilot() {
		return hasAutoPilot;
	}

	public void setHasAutoPilot(boolean hasAutoPilot) {
		this.hasAutoPilot = hasAutoPilot;
	}

	public gasType getGasType() {
		return gasType;
	}

	public void setGasType(gasType gasType) {
		this.gasType = gasType;
	}

	private String model;
	private int speed;
	private int capacity;
	private int numberOfWheels;
	private boolean hasAerofoil;
	private boolean hasAutoPilot;
	private gasType gasType;
	private int gear;

	public String gasTypeOfMessage(gasType type) {
		setGasType(type);
		
		return "Gaz" + String.valueOf(type) + " Olarak Değiştirildi";
	}

	public void setGear(int gear) {
		this.gear= gear;
		
	}
}
