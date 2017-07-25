package tr.org.linux.kamp.enumlar;

public enum Calculator {
	TOPLA, CIKART, CARP, BOL;
	int sonuc;
	
	
	public int makine(int x, int y) {
		
		
		switch(this) {
		case TOPLA:
			sonuc = x+y;
			return sonuc;
		case CIKART:
			sonuc = x-y;
			return sonuc;
		case CARP:
			sonuc = x*y;
			return sonuc;
		case BOL:
			sonuc = x/y;
			return sonuc;
			default:
				System.out.println("hatalı girdiniz");
				return -1;
		}
		
	}
}
