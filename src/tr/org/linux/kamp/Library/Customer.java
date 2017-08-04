package tr.org.linux.kamp.Library;

import java.util.ArrayList;

public class Customer {
	private String userName;
	private String userSurname;
	private ArrayList<Purchase> purchaseHistory = new ArrayList<>();
	private int purchaseCount;

	public Customer(String userName, String userSurname) {
		super();
		this.userName = userName;
		this.userSurname = userSurname;

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public ArrayList<Purchase> getPurchaseHistory() {
		return purchaseHistory;
	}

	public void setPurchaseHistory(ArrayList<Purchase> purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}

	public int getPurchaseCount() {
		return purchaseCount;
	}

	public void setPurchaseCount(int purchaseCount) {
		this.purchaseCount = purchaseCount;
	}

	public void placePurchase(Purchase purch) {
		purchaseHistory.add(purch);
		purchaseCount++;
	}
}
