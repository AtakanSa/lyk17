package tr.org.linux.kamp.exception;

import java.util.Scanner;

public class ExceptionExample {
public static void main(String[] args) {
	int a = 5;
	int b = 0;
	
	
	int yas = 10;
	
	try {
		if(yas<0) {
			throw new MyException();
		}
	}
		catch(MyException e){
			System.out.println(e.getLocalizedMessage());
				
			
		
	}
			
	
		
		


	int[] f = {2};
	try {
		f[98] = 0;
	} catch (Exception e) {
		System.out.println(e);
	}
	

	try {
		int bolum = a/b;
	} catch (Exception e) {
		System.out.println(e);
	}
}

public static void a(int a) throws Exception{
	
}
}

