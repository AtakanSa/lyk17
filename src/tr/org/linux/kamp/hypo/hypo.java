package tr.org.linux.kamp.hypo;

import java.util.Scanner;

public class hypo {

	public static int x, y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Kenar : ");
		x = sc.nextInt();
		System.out.println("2. Kenar : ");
		y = sc.nextInt();

		System.out.println("Hipotenüsü : " + getHypo(x, y));
		System.out.println("Alanı : " + getArea(x, y));
		System.out.println("Çevresi : " + getPelimetre(x, y));

	}

	public static int getHypo(int x, int y) {
		return (int) Math.hypot(x, y);
	}

	public static double getArea(int x, int y) {
		return (double) (x * y) / 2;
	}

	public static double getPelimetre(int x, int y) {
		int hypo = getHypo(x, y);
		return (x + y + hypo);
	}

}
