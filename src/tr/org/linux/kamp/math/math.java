package tr.org.linux.kamp.math;

import java.util.Random;

public class math {
	public static void main(String[] args) {
		Math.random();

		Random r = new Random(0);

		System.out.println(r.nextInt(50));

	}
}
