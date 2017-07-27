package tr.org.linux.kamp.oop2;

public class Snake extends Reptile implements Cornivore {

	public Snake(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	int longth;

	
	void crawl() {
		// TODO Auto-generated method stub

	}

	void Attack() {
		System.out.println(getName() +  " IS ATTACKING");
	}

	@Override
	void claw() {
		// TODO Auto-generated method stub
		
	}
}
