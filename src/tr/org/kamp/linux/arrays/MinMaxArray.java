package tr.org.kamp.linux.arrays;

import java.util.Arrays;
import java.util.Random;

public class MinMaxArray {

	static int choosen, last, min, max, toplam, ort;
	static Random r = new Random();

	public static void main(String[] args) {
		int[] myArray = new int[15];

		generateArray(myArray);
		printArray(myArray);
		System.out.println("Minimum :" + minFinder(myArray));
		System.out.println("Maximum :" + maxFinder(myArray));

		System.out.println("");

		System.out.println("Ortalama : " + Ortalama(min, max, myArray));
	}

	public static int minFinder(int[] array) {
		min = array[0];
		for (int i = 0; i < 15; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int maxFinder(int[] array) {
		max = array[0];
		for (int i = 0; i < 15; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	public static int Ortalama(int min, int max, int[] array) {
		for (int i = 0; i < 15; i++) {
			toplam += array[i];

		}
		toplam -= max + min;
		ort = toplam / 13;
		return ort;

	}

	public static int[] generateArray(int[] array) {

		for (int i = 0; i < 15; i++) {
			choosen = r.nextInt(50);
			array[i] = choosen;

		}
		return array;
	}
}
