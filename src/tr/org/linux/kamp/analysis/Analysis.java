package tr.org.linux.kamp.analysis;

import java.util.Scanner;

public class Analysis {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;
		
		while(studentCounter <= 10) {
			System.out.println("Sonucu giriniz, 1 = geçti, 2 = kaldı");
			
			result = input.nextInt();
			
			if(result == 1) {
				passes = passes + 1;
				studentCounter = studentCounter + 1;
			}
			else if(result == 2) {
				failures = failures + 1;
				studentCounter = studentCounter + 1;
			}
			else System.out.println("Lütfen 1 ya da 2 olarak giriniz");
		}
		input.close();
		System.out.println("Geçenler: " + passes);
		System.out.println("Kalanlar: " + failures);
	}

}
