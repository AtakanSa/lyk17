package tr.org.linux.kamp.sphere;

import java.util.Scanner;
import java.util.Stack;

public class SphereExample {
	static int x;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yarıçap Giriniz : ");
		x = sc.nextInt();
		System.out.println(hacim(x));
	}

	public static double hacim(int radius) {
		return ((4 * Math.PI * Math.pow(radius, 3)) / 3);
	}
}
