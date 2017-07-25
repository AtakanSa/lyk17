package tr.org.kamp.linux.arrays;

import java.util.Random;

public class generateArray {
	static int length, choosen, last;
	static Random r = new Random();

	public static void main(String[] args) {

		length = r.nextInt(15);
		int[] myArray = new int[length];
		generateArray(myArray);
		sortArray(myArray);
		printArray(myArray);
		System.out.println("son indexli 5 : " + lastIndex(myArray));

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	public static int[] generateArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			choosen = r.nextInt(10);
			array[i] = choosen;

		}
		return array;
	}

	public static int[] sortArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] > array[j]) {
					int temp;
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}

	public static boolean SearchItem(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 5) {

				return true;

			}

		}
		return false;

	}

	public static int lastIndex(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 5) {
				last = i;

			}

		}
		return last;
	}

}
