package tr.org.linux.kamp.Document;

import java.util.ArrayList;
import java.util.Random;

public class DocumentApp {

	public static void main(String[] args) {

		int choosen;
		PDF pdf = new PDF("ben bir pdf'im");
		LibreOfficeCalc calc = new LibreOfficeCalc("ben bir calc 'ım");
		Picture pic = new Picture("ben bir pic'im");
		
		
		ArrayList<Document> documents = new ArrayList<>();
		documents.add(pdf);
		documents.add(calc);
		documents.add(pic);

		Random r = new Random();

		choosen = r.nextInt(3);

		documents.get(choosen).printDocument();
		

	}

}
