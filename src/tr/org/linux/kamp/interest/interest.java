package tr.org.linux.kamp.interest;

public class interest {

	public static void main(String[] args) {

		for (int i = 1; i < 50; i++) {
			if (i % 15 == 0) {
				System.out.println(i + "fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println(i + "fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + "buzz");
			}

		}
	}

}