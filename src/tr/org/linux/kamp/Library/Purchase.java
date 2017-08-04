package tr.org.linux.kamp.Library;

public class Purchase  {
	private String purchaseDate;
	private String shippingDate;
	private int deliveryLenght;
	private ShoppingCard shopCard;

	public Purchase(String purchaseDate, String shippingDate, int deliveryLenght,ShoppingCard shopCard) {
		
		this.purchaseDate = purchaseDate;
		this.shippingDate = shippingDate;
		this.deliveryLenght = deliveryLenght;
		this.shopCard = shopCard;

	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getshippingDate() {
		return shippingDate;
	}

	public void setshippingDate(String shpiingDate) {
		this.shippingDate = shpiingDate;
	}

	public int getDeliveryLenght() {
		return deliveryLenght;
	}

	public void setDeliveryLenght(int deliveryLenght) {
		this.deliveryLenght = deliveryLenght;
	}

}
