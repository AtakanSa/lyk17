package tr.org.linux.kamp.garbageCollector;

public class Gc {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		while(rt.freeMemory()!=0) {
			System.out.println(rt.freeMemory());
		}
	}
	public enum asd{
		asd,asdf,adsf,adsfdd
	}
}



