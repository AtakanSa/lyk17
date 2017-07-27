package tr.org.linux.kamp.oop2;

public class Dragon extends Monster implements flyable,fearer {

	@Override
	void frighten() {
	
		
	}

	@Override
	public void canMakeYouScared() {
		System.out.println("DRAGON SCARED YOU");
		
	}

	@Override
	public void fly() {
		System.out.println("Dragon is Flying");
		
	}

}
