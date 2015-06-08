package API;

public class Vjezbe7 {
	
	/*
	 * Zadatak 7 (treci paragraf zadatka)
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			int num = Integer.parseInt(args[i]);
			if (num%5==0) {
				System.out.println(num);
			}
		}

	}

}
