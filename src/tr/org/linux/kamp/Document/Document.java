package tr.org.linux.kamp.Document;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Document {
	private String content;

	LocalDateTime currentTime = LocalDateTime.now();
	private int time;

	public Document(String content) {
		super();
		this.content = content;
		this.time = currentTime.getMinute();

	}

	private String getText() {
		return content;
	}

	public void printDocument() {
		System.out.println(content + " " + time + " Geçe Oluşturuldu.");

	}
}
