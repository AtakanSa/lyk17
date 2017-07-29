package tr.org.linux.kamp.montecarlo;

public class Threads {
	public static void main(String[] args) {
		
	
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("0. calisti");
				
			}
			
		}).start();
		
		System.out.println("1. calisti");
		System.out.println("2. calisti");
		System.out.println("3. calisti");
		
		
		 
		 
		
	}
	public static void zb() {
		 new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.println("4. calisti");
					ax();
					
				}
				
				
			}).start();
	}
	
	public static void ax() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("5. calisti");
				zb();
				
			}
			
		}).start();
	}
}
