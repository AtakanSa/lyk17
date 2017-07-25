package tr.org.linux.kamp.karakter;

import java.util.Scanner;

public class CeaserCode {
	public static String message;
	public static int key;
	public static char c;
	public static String codedMessage, decodedMessage;
	public static String returnMessage = "";

	public static void main(String[] args) {

		System.out.println("Mesajınızı girin : ");
		Scanner sc = new Scanner(System.in);
		message = sc.nextLine();
		System.out.println("Key girin : ");
		key = sc.nextInt();
		
		

		String a = krypto(message, key);
		String b = a.substring(4);
		System.out.println(b);
		// String c =
		String c = encrypto(b, key);
		String d = c.substring(4);
		System.out.println(d);

	}

	public static String encrypto(String message, int key) {
		key = -key;

		for (int i = 0; i < message.length(); i++) {

			if (message.charAt(i) + key >= 90) {
				if (122 >= message.charAt(i) + key && message.charAt(i) + key >= 90) {
					c = (char) (message.charAt(i) + key);
					decodedMessage += c;
				} else {
					c = (char) (message.charAt(i) - 26 + key);
					decodedMessage += c;
				}

			} else {
				if (message.charAt(i) < 65) {
					c = message.charAt(i);
					decodedMessage += c;
				} else {
					if ((message.charAt(i) + key) <= 90)
						c = (char) (message.charAt(i) + key);
					else
						c = (char)(message.charAt(i));
					decodedMessage += c;
				}

			}

		}
		return decodedMessage;

	}

	public static String krypto(String message, int key) {
		for (int i = 0; i < message.length(); i++) {

			if (message.charAt(i) + key >= 90) {
				if (122 >= message.charAt(i) + key && message.charAt(i) + key >= 90) {
					c = (char) (message.charAt(i) + key);
					codedMessage += c;
				} else {
					c = (char) (message.charAt(i) - 26 + key);
					codedMessage += c;
				}

			} else {
				if (message.charAt(i) < 65) {
					c = message.charAt(i);
					codedMessage += c;
				} else {
					if ((message.charAt(i) + key) <= 90)
						c = (char) (message.charAt(i) + key);
					else
						c = (char) (message.charAt(i));
					codedMessage += c;
				}

			}

		}
		return codedMessage;

	}
}
