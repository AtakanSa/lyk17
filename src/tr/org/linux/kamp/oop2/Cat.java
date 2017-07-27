package tr.org.linux.kamp.oop2;

public class Cat extends Mammal implements Cornivore{

	public Cat(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	private String name;
	private int PawCount;
	
	@Override
	void giveBirth() {
		System.out.println(getName() +"doğuruyor");
		super.giveBirth();
	}
	void meow() {
		System.out.println(getName() +"miyavliyor");
	}
	
	
	
	
	
}
