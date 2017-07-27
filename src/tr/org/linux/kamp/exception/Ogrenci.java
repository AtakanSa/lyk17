package tr.org.linux.kamp.exception;

public class Ogrenci {

	public static  String adi;
	public String tc;
	public int not;
	
	/*public  Ogrenci(String adi,String tc,int not) {
		this.adi = adi;
		this.tc = tc;
		this.not = not;
	}*/
	
	
	
	public static void notKontrol(int not) {
		try {
			if(0>not || not>100)
				throw new OgrenciExcecpto();
			else
				System.out.println("geçerli not");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
