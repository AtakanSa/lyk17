package tr.org.linux.kamp.oop;

public class Kullanıcı {

	private String cardNumber;
	private int money;

	protected String[] Users = { "Ahmet", "atakan", "mustafa" };
	protected String[] Pass = { "1234", "12345" ,"123"};

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
