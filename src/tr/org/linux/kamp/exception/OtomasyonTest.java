package tr.org.linux.kamp.exception;

import java.util.Scanner;

public class OtomasyonTest {

	public static void main(String[] args) {
		Ogrenci ogr = new Ogrenci();

		Scanner sc = new Scanner(System.in);
		System.out.println("adi :");
		try {
			ogr.adi = sc.next();
		} catch (Exception e) {
			System.out.println("Hatalı İsim Girdiniz");
		}

		System.out.println("tc :");
		try {
			ogr.tc = sc.next();
			if (ogr.tc.length() < 11) {
				throw new OgrenciExcecpto();
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		System.out.println("not :");
		try {
			ogr.not = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Hatalı Not Girdiniz");
		}

		ogr.notKontrol(ogr.not);

	}
}
