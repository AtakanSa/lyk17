package tr.org.linux.kamp.oop2;

public abstract class Bird extends Animal implements Herbivore  {
	
	public Bird(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}
	abstract void fly();
	abstract void cikcik();
	
}
