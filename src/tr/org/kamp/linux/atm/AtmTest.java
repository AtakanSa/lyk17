package tr.org.kamp.linux.atm;

public class AtmTest {
	
	public static void main(String[] args) {
		User user = new User("1", "2");
		ATM atm = new ATM(user);
		
		generateUsers(atm);
		showUsers(atm);
		//atm.login(user);
		System.out.println("bakiye  : " + atm.getUser().getAmount());
		
		if(atm.credit(100) == 1) {
			System.out.println("para yatırma işlemi başarılı");
		}
		else if(atm.credit(100) == -2){
			System.out.println("lütfen giriş yapınız");
			System.out.println("para yatırma işlemi başarısız");
		

		}
		System.out.println("bakiye  : " + atm.getUser().getAmount());
			
		
	}

	private static String credit(int i) {
		if(i ==-1)
			return "giriş yap";
		else if(i == 0)
			return "giriş yap";
			else
				return "giriş yap";
		
	}
	private static void generateUsers(ATM atm) {
		User u;
		int amount = 500;
		for(int i = 0 ; i < atm.getUserList().length ; i++) {
			u = new User(Integer.toString(i+1), Integer.toString(i+2), amount+=100);
			//atm.getUserList()[i] = u;
			atm.setUserList(u, i );
			
		}
		
		
	}
	
	private static  void showUsers(ATM atm) {
		System.out.println("======Hesaplar=====");
		for(int i = 0 ; i < atm.getUserList().length ; i++) {
			System.out.println(atm.getUserList()[i].getAccountNumber()+  " "
					+atm.getUserList()[i].getPassword()+"  " +
					atm.getUserList()[i].getAmount());
		}
	}
}

