package API;

public class Zadaca2 {

	/**
	 * Converts Celsius to Kelvins
	 * <p>
	 * @param c - temperature in celsius
	 * @return - temperature in kelvins
	 */
	public static double convertToKelvins (double c) {
		
		double kelvins = c+273.15;
		
		return kelvins;
		
	}
	
	public static void main(String[] args) {
		

		System.out.println("Entered temperature is " + convertToKelvins(Double.parseDouble(args[0])) + " in Kelvins");

	}

}
