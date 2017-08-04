package tr.org.linux.kamp.Library;

public class HardCopyBook extends Book {

	public HardCopyBook(String name, String author, int price, int bookID, int weight, int shippingCost) {
		super(name, author, price, bookID);
		this.weight = weight;
		this.shippingCost = shippingCost;
		// TODO Auto-generated constructor stub
	}

	private int weight;
	private int shippingCost;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(int shippingCost) {
		this.shippingCost = shippingCost;
	}

	public int getTotalCost() {
		return shippingCost+super.getPrice();
	}

}
