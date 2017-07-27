package tr.org.linux.kamp.oop;

public class BicycleTest {
	public static void main(String[] args) {
		MountainBicycle bisiklet = new MountainBicycle();
		bisiklet.setSpeed(20);
		System.out.println(bisiklet.getSpeed());
		bisiklet.ChangeSpeed(50);
		bisiklet.ChangeGear(-2);
		System.out.println(bisiklet.getSpeed());
	}

}
