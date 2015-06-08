package API;

public class Vjezbe8 {

	public static void main(String[] args) {
		

		double num = Double.parseDouble(args[0]);
		int number = (int)(Math.pow(10, num));
//		String str = Integer.toString(number-1);
		
//		System.out.println(str);
		
		for (int i = (int)Math.pow(10, num-1); i < number; i++) {
			for (int j = 2; j < number; j++) {
				if (i%j == 0){
					System.out.println(j);
				} 
			}
		} 
	}

}
