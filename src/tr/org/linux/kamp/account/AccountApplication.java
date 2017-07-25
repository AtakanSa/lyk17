package tr.org.linux.kamp.account;

import java.util.Random;

public class AccountApplication {
	public static Random r = new Random();

	public static void main(String[] args) {
		System.out.println(chooseRandomCard());
	}

	private static String chooseRandomCard() {
		return chooseRandomRank() + " of " + chooseRandomSuit();
	}

	private static String chooseRandomRank() {
		int choosen;
		choosen = r.nextInt(13)+1;
		switch (choosen) {
		case 1:
			return "Ace";
		case 11:
			return "Prince";
		case 12:
			return "Queen";
		case 13:
			return "King";
		}
		return String.valueOf(choosen);

	}

	private static String chooseRandomSuit() {
		int choosen;
		choosen = r.nextInt(4);
		switch (choosen) {
		case 0:
			return "spade";
		case 1:
			return "diamond";
		case 2:
			return "club";
		case 3:
			return "heart";
		
			
		}return "";
	}

}
