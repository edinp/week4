package API;

public class Vjezbe2 {

	public static void main(String[] args) {

		/*
		 * Zadatak 3
		 */
		
		try{
		if (args.length>2) {
			System.out.println("Please enter two numbers");
		} else if (args.length==0) {
			System.out.println("No numbers! Enter two numbers.");
		} else {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int divide = a/b;
			System.out.println("Divide result is: " + divide);
		}
		} catch (NumberFormatException e1) {
			System.out.println("Not possible! Please enter two NUMBERS.");
		} catch (ArithmeticException e2) {
			System.out.println("Dividing with ZERO is not possible.");
		} catch (IndexOutOfBoundsException e3) {
			System.out.println("Too many numbers. Please enter TWO numbers.");
		}
		

	}

}
