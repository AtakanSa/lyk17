package tr.org.linux.kamp.karakter;

import java.util.Random;

public class karakterler {
	public static void main(String[] args) {
		Random r = new Random();

		String c = "asdaa";
		String b = "asdaa";
		
		String l = new String("asd");
		String k = new String("asd");
		if(l==k)
			System.out.println("döndü");
		if(l.equals(k))
			System.out.println("dönüştürüldü");
		
		
		System.out.println(l.substring(0,2)=="as");
		
		
		if(c == b)
			System.out.println("true");
		b.replace('d','c');
		System.out.println(("a s da s d asd".replace(' ', '-')));
		System.out.println(b);
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == 'a')
				System.out.println(i);
		}

	}
}
