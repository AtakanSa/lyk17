package tr.org.linux.kamp.enumlar;

public class CalculatorApp {
	public static Calculator calc;
	
	public CalculatorApp(Calculator calc) {
		this.calc=calc;
	}
	
	public static void main(String[] args) {
		CalculatorApp app = new CalculatorApp(Calculator.TOPLA);
		System.out.println(calc.makine(2, 3));
		System.out.println(Calculator.TOPLA.makine(2, 5));
	}
	
}
