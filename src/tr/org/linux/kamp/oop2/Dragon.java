package tr.org.linux.kamp.oop2;

public class Dragon extends Monster implements flyable,fearer {

	void FireBreath() {
		System.out.println("ARRRGGHHGHG");
	}
	
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
