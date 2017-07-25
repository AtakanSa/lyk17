package tr.org.linux.kamp.enumlar;

public class DaysTest {
	static Days day;
	
	public DaysTest(Days string) {
		this.day=string;
	}
	
	public static void tellAboutDay() {
		switch(day) {
		case PAZARTESI:
			System.out.println("Pazartesi iğrençtir");
			break;
		case SALI:
			System.out.println("Salı sallanır");
			break;
		}
	}
	public static void main(String[] args) {
		DaysTest test = new DaysTest(Days.SALI);
		test.tellAboutDay();
		
		
	}
}
