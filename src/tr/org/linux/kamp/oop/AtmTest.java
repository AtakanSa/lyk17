package tr.org.linux.kamp.oop;

import java.util.Scanner;

public class AtmTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("isim giriniz :");
		String name = sc.next();
		System.out.println("Şifre giriniz :");
		int pass = sc.nextInt();
		atm denek = new atm();
		denek.login(name, pass);
		denek.addMoney(20);
		denek.setMoney(50);
		denek.addMoney(10);
		denek.logout();
		
		
		
		
	}
}
