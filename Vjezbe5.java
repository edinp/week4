package API;

public class Vjezbe5 {

	/*
	 * Zadatak 5 (posljednji dio, getMax metoda za double)
	 */
	public static void main(String[] args) {
		
		try{
			if (args.length>0){
				double max = Double.parseDouble(args[0]);
				for (int i = 0; i<args.length; i++){
					double num = Double.parseDouble(args[i]);
					if (num>max){
						max = num;
					}
				} 
				System.out.println("Biggest number is: " + max);
			} else {
				System.out.println("Please enter some numbers.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Please enter only numbers.");
		} 
	}
}
