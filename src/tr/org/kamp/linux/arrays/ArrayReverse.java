package tr.org.kamp.linux.arrays;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] myArray = { 2, 3, 4, 5, 6, 7, 8, 9 };
		String asd = Arrays.toString(reverseArray(myArray));
		System.out.println(asd);
	}

	public static int[] reverseArray(int[] array) {
		int[] reverse = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reverse[array.length - i - 1] = array[i];
		}
		return reverse;
	}
}
