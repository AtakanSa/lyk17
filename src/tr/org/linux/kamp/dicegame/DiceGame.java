package tr.org.linux.kamp.dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static String player1, player2;
	public static int p1value,p2value;
	public static Random r = new Random();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Kullanıcıyı Girin :");
		player1 = sc.next();
		System.out.println("2. Kullanıcıyı Girin :");
		player2 = sc.next();
		p1value=roll();
		p2value=roll();
		
		if(p1value<p2value)
		{
			System.out.println(player2 + " Zarı" +" " +p2value+" " + player1 + " Zarı"+" " +p1value);
			System.out.println(player2 + "  Kazandı !");
		}
		else if(p1value == p2value)
			System.out.println("berabere");
		else {
			System.out.println(player2 + " Zarı" +" " +p2value+" " + player1 + " Zarı"+" " +p1value);
			System.out.println(player1 + " Kazandı !");
		}
		

	}
//winner = (dice1<dice2) ? user1 : (dice1==dice2) ? "berabere" : user2;
	public static int roll() {
		return r.nextInt(6) + 1;
	}
}
