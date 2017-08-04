package tr.org.linux.kamp.CLASS;

public class lesson1 {

	public static void main(String[] args) {
		int a = 1;
		int b=0;
		while (a < 51) {
			
			if(a%15==0)
			{
				b=3;
			}
				
			else if(a%3==0) {
				b=2;
			}
			
			else if(a%5==0) {
				b=1;
			}
			else {
				b=0;
			}
				
			
			switch(b) {
			case 3:
				System.out.println(a + " Fizz Buzz");
				break;
			case 2:
				System.out.println(a + " Buzz");
				break;
			case 1: 
				System.out.println(a + " Fizz");
				break;
				default:
					System.out.println(a);
					break;
			
			}
			/* if (a % 15 == 0) {
				System.out.println(a + " Fizz Buzz");
			} else if (a % 5 == 0) {
				System.out.println(a + " Buzz");
			} else if (a % 3 == 0) {
				System.out.println(a + " Fizz");
			} */
			a++;
		}
	}
}