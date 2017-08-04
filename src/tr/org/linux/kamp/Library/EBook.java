package tr.org.linux.kamp.Library;

public class EBook extends Book{

	

	public EBook(String name, String author, int price, int bookID,int fileSize,String encodingFormat) {
		super(name, author, price, bookID);
		this.fileSize = fileSize;
		this.encodingFormat = encodingFormat;
		// TODO Auto-generated constructor stub
	}

	private int fileSize;
	private String encodingFormat;
	private int numberOfDevicesBookBeingUsed;

	public void addDevice() {
		numberOfDevicesBookBeingUsed++;

	}

	public void removeDevice() {
		numberOfDevicesBookBeingUsed--;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public int getNumberOfDevicesBookBeingUsed() {
		return numberOfDevicesBookBeingUsed;
	}

	public void setNumberOfDevicesBookBeingUsed(int numberOfDevicesBookBeingUsed) {
		this.numberOfDevicesBookBeingUsed = numberOfDevicesBookBeingUsed;
	}

}
