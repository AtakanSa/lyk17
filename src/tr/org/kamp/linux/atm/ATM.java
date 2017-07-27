package tr.org.kamp.linux.atm;

public class ATM {
	private User user;
	private User[] userList = new User[3];
	private boolean isLogin = false;
	
	public ATM(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User[] getUserList() {
		return userList;
	}
	public void setUserList(User user , int index) {
		this.userList[index] = user;
	}
	public boolean isLogin() {
		return isLogin;
	}
	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
	
	
	
	///Login 
	//para çek
	//para yatır
	//logout
	
	public void login(User user) {
		if(!isLogin) {
			for(int i = 0 ; i < userList.length ; i++) {
				if(user.getAccountNumber().equals(userList[i].getAccountNumber())) {
					if(user.getPassword().equals(userList[i].getPassword())) {
						isLogin = true;
						this.user = userList[i];
						//this.user.setAmount(userList[i].getAmount());
						System.out.println("gelen user : " + user.getAmount() + " kayıtlı user:" + userList[i].getAmount());
						
						System.out.println("Başarıyla giriş yapıldı");
						//break;
					}else {
						System.out.println("kart no veya parola hatalı");
						
					}
				}
				
			}
		}else {
			System.out.println("Zaten giriş yapıldı");
		}
		
	}
	
	public void logout() {
		isLogin = false;
	}
	
	public int credit(double amount) {
		if(isLogin) {
			if(amount < 0 ) {
			
				return -1;
				
			}else {
				
				double credit =  this.user.getAmount();
				this.user.setAmount(credit+ amount);
				return 1;
			}
		}else {
			
			
			return -2;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
