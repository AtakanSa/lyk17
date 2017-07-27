package tr.org.linux.kamp.oop;

public class atm extends Kullanıcı {

	private boolean verified;
	private boolean idtrue;
	private boolean passtrue;
	public int a;

	public void login(String name, int pass) {
		for (int i = 0; i < Users.length; i++) {
			if (name.equals(Users[i])) {
				idtrue = true;
				a = i;
			}
		}
		if (Integer.toString(pass).equals(Pass[a]))
			passtrue = true;

		if (passtrue && idtrue) {
			verified = true;
			System.out.println("giriş yapıldı");
		} else {
			System.out.println("giriş başarısız");
		}

	}

	public void giveMoney(int money) {
		if (verified) {
			super.setMoney((super.getMoney() - money));
			System.out.println("yeni bakiye : " + (super.getMoney()));
		}

		else
			System.out.println("önce giriş yapın");
	}

	public void showMoney() {
		if (verified)
			System.out.println(super.getMoney());
		else
			System.out.println("önce giriş yapın");
	}

	public void addMoney(int money) {
		if (verified) {
			super.setMoney((super.getMoney() + money));
			System.out.println("yeni bakiye : " + (super.getMoney()));
		}

		else
			System.out.println("önce giriş yapın");
	}

	public void logout() {
		if (verified) {
			verified = false;
			idtrue = false;
			passtrue = false;
			System.out.println("Çıkış yapıldı");

		}
		else {
			System.out.println("Önce giriş yapınız");
		}
	}
	

}
