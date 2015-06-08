package API;

public class Vjezbe3 {

	/**
	 * Sums all entered parameters.
	 * <p>
	 * @param args - entered parameters.
	 * @exception - when entered parameter is not a number, NumberFormatException
	 */
	public static void main(String[] args) {
		
		int sum = 0;
		
		try {
		if (args.length==0) {
			System.out.println("No entered numbers.");
		} else if (args.length>0) {
		for (int i = 0; i<args.length; i++) {
			int num = Integer.parseInt(args[i]);
			sum+=num;
		}
		
		System.out.println("Sum of all numbers is: " + sum);
		}
		
		} catch (NumberFormatException e1) {
			System.out.println("Please enter ONLY numbers");
		}
	}

}
