package API;

import java.awt.Font;

public class Vjezbe1 {

	public static void main(String[] args) {
		
		/*
		 * Zadatak 1
		 */
		System.out.println("Area of Square is: " + getAreaOfSquare(3));

		/*
		 * Zadatak 2
		 */
		Font mojFont = new Font ("Times New Roman", Font.PLAIN, 18);
		printFontDetails(mojFont);
		

		
	}
	
	/**
	 * Calculates area of square.
	 * <p>
	 * @param a - one side length
	 * @return Area of Square
	 * @throws IllegalArgumentException if a<0
	 */
	
	public static double getAreaOfSquare(double a) {
		
		if (a < 0) {
			throw new IllegalArgumentException("Negative number");
		}

		double area = a*a;
		
		return area;
		
		
	}
	
	public static void printFontDetails (Font f) {
		
		if(f==null){
			throw new NullPointerException("Nepoznat broj");
		}
		
		System.out.println("Velicina fonta: " + f.getSize());
		System.out.println("Ime fonta: " + f.getName());
		
		
	}
	
	
}
