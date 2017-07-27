package tr.org.linux.kamp.oop2;

public abstract class Mammal extends Animal{
	

	public Mammal(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	void giveBirth() {
		 System.out.println("Doğurdu");
	 }
}
