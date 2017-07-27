package tr.org.linux.kamp.oop2;

public class Vampire extends Monster implements fearer {

	@Override
	void frighten() {
		// TODO Auto-generated method stub
		
	}
	void bite() {
		System.out.println();
	}
	@Override
	public void canMakeYouScared() {
		// TODO Auto-generated method stub
		
	}
	
	public void canBeScaredByGarlic() {
		System.out.println("vampir korkuyo");
	}

}
