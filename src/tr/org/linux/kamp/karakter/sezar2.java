package tr.org.linux.kamp.karakter;

import java.util.Scanner;

public class sezar2 {
	public static int key;
	public static char c;
	public static String decoded="", coded="",message="";

	public static void main(String[] args) {

		System.out.println("Mesajınızı girin : ");
		Scanner sc = new Scanner(System.in);
		message = sc.nextLine();
		System.out.println("Key girin : ");
		key = sc.nextInt();
		if(key<0)  key = 26-(key%26);
			
		String b = krypto(message,key);
		System.out.println(b);
		System.out.println(encrypto(b,key));
	}
	
	public static String encrypto(String message, int key) {
	key=-key;
	for (int i = 0; i < message.length(); i++) {

		if (!Character.isLetter(message.charAt(i)))
			decoded += message.charAt(i);
		else {
			if (Character.isLowerCase(message.charAt(i))) {
				decoded +=(char)( 'a' + (message.charAt(i)+ key -'a')%26);
				
			} 
			else {
				decoded +=(char) ('A' + (message.charAt(i)+ key -'A')%26);
				
			}
			
			
		}
		
	}
	return decoded;
		
	}

	public static String krypto(String message, int key) {
		
		
		for (int i = 0; i < message.length(); i++) {


			if (!Character.isLetter(message.charAt(i)))
				coded += message.charAt(i);
			else {
				if (Character.isLowerCase(message.charAt(i))) {
					coded +=(char)( 'a' + (message.charAt(i)+ key -'a')%26);
					
				} 
				else {
					coded +=(char) ('A' + (message.charAt(i)+ key -'A')%26);
					
				}
				
				
			}
			
			
		}
		return coded;
	}
}
