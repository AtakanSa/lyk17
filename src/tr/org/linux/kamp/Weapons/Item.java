package tr.org.linux.kamp.Weapons;

public abstract class Item {
	private int itemPrice;
	private int itemWeight;
	private int itemQuantity = 0;
	private boolean useItem;

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public boolean isUseItem() {
		return useItem;
	}

	public void setUseItem(boolean useItem) {
		this.useItem = useItem;
	}

	public Item(int itemPrice, int itemWeight, boolean useItem) {
		super();
		this.itemPrice = itemPrice;
		this.itemWeight = itemWeight;
		itemQuantity++;
		this.useItem = useItem;
	}

}
