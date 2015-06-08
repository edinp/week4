package API;

import java.util.Arrays;

public class Vjezbe4 {

	public static void main(String[] args) {
		
		int[] niz = new int[]{-1, 1,-6,-3,-4,-5};
		double[] nizz = new double[]{1.2, 3.6, -1.4, 2.8};
		
		System.out.println("Bigger number is: " + getMax(2.2, 3.1));
		System.out.println("Biggest int number is: " + getMax(niz));
		System.out.println("Biggest double number is: " + getMax(nizz));

	}
	
	/**
	 * Compares two double numbers
	 * <p>
	 * @param a - first number
	 * @param b - second number
	 * @return - higest number
	 */
	public static double getMax(double a, double b) {
		
		if (a>b) {
			return a;
		}
		
		return b;
	}
	
	/**
	 * Compares all elements of array (ints)
	 * <p>
	 * @param array - Name says it all :)
	 * @return - highest number
	 */
	public static int getMax(int array[]) {
		
		int max = array[0];
		for (int i = 0; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i]; 
			}
		}
		return max;
	}
	
	/**
	 * Compares all elements of array (doubles)
	 * <p>
	 * @param array - Name says it all
	 * @return - highest number
	 */
	public static double getMax(double array[]) {
		
		double max = array[0];
		for (int i = 0; i<array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}

}
