package DateTimeApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class kac_yasindasin_Sen {
	public static int ay;
	public static int gun, year;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ay");
		ay = (sc.nextInt());
		System.out.println("gün");
		gun = (sc.nextInt());
		System.out.println("yil");
		year = (sc.nextInt());
		hesapla(gun, ay, year);

	}

	public static void hesapla(int day, int month, int year) {
		LocalDate date = LocalDate.now();

		System.out.println(ChronoUnit.DAYS.between(LocalDate.of(year, month, day), date));

	}

}
