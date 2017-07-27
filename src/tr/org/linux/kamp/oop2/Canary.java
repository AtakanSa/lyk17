package tr.org.linux.kamp.oop2;

public class Canary extends Bird implements Cornivore, Herbivore {

	

	public Canary(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	String name;
	int cikCount;

	

	@Override
	public void eatPlants() {
		System.out.println(name + " Yemek Yedi");

	}

	@Override
	void fly() {
		System.out.println(name + " Uçtu");

	}

	@Override
	void cikcik() {
		System.out.println(name + " Cikledi");

	}
	
	void flip() {
		System.out.println(name + " Takla atıyor");
	}

}
