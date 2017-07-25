package tr.org.linux.kamp.account;

import java.util.Scanner;

public class asalSayilar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		
		while(count>=1){
			
		
		for(int i =1;i<=count;i++) {
			System.out.print(i);
			
		}
		for(int i=count-1;i>0;i--) {
			System.out.print(i);
		}
		System.out.println("");
		count--;
		}
	}
}
