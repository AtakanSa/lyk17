package tr.org.linux.kamp.Library;

public class Book {
	private String name;
	private String author;
	private int price;
	private int bookID;

	public void applyDiscount(int Discount) {
		int disc = price - (price*Discount /100);
		price -= disc;
	}

	public Book(String name, String author, int price, int bookID) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.bookID = bookID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

}
