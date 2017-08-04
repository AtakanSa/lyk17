package tr.org.linux.kamp.Library;

public class LibraryTest {
	public static void main(String[] args) {
		EBook ebook = new EBook("Kaşağı", "ömer seyfetting", 2, 1, 200, "PDF");
		Customer cust = new Customer("Atakan", "Sarı");
		ShoppingCard shopCard = new ShoppingCard();
		shopCard.addBook(ebook);
		Purchase purch = new Purchase("1.1.1", "1.1.1", 2, shopCard);
		cust.placePurchase(purch);
		System.out.println(cust.getPurchaseHistory().get(0).getPurchaseDate());

	}
}
