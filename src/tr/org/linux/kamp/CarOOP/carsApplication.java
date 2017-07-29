package tr.org.linux.kamp.CarOOP;

public class carsApplication {
	public static void main(String[] args) {
		Car araba = new Car("Ferrari","458Italia",280,2,4,false,false,gasType.LPG);
		araba.excuteMotor();
		System.out.println(araba.getGasType());
		
		Plane ucak = new Plane("Boeng","A280",500,5,2,true,true,gasType.BENZIN);
		
		System.out.println(ucak.getGasType());
		ucak.setType(liftOffType.Horizontal);
		System.out.println(ucak.getType());
	}
}
