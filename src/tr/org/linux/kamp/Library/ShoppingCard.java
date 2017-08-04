package tr.org.linux.kamp.Library;

import java.util.ArrayList;

public class ShoppingCard  {
	

	private ArrayList<Book> contents = new ArrayList<>();
	private int numOfEntriesInTheCard;

	public int getNumOfEntriesInTheCard() {
		return numOfEntriesInTheCard;
	}

	public void setNumOfEntriesInTheCard(int numOfEntriesInTheCard) {
		this.numOfEntriesInTheCard = numOfEntriesInTheCard;
	}

	public void addBook(Book book) {
		contents.add(book);
		numOfEntriesInTheCard = contents.size();
	}

}
