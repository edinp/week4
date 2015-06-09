package API;

public class Zadaca1 {

	public static void main(String[] args) {
		

		int min = Integer.parseInt(args[0]);
		
		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) < min) {
				min = Integer.parseInt(args[i]);
			}
		}
		System.out.println("Lowest number is: " + min);

	}

}
