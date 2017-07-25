package tr.org.kamp.linux.arrays;

public class carpimtablosu {

	public static void main(String[] args) {
		int[][] tablo = new int[5][5];

		for (int i = 1; i < tablo.length + 1; i++) {
			for (int j = 1; j < tablo.length; j++) {
				tablo[i][j] = i * j;
				System.out.print(tablo[i][j] + "\t ");

			}
			System.out.println("");
		}

	}
}
