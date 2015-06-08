package API;

public class Predavanje1 {
	
	
	/**
	 * <b>Prints</b> hello world to the screen.
	 * <p>
	 * Sends string "Hello World" to the standard output.
	 */
	
	
	public static void sayHello() {
		System.out.println("Hello, World!");
	}
	
	/**
	 * Greets user by the name.
	 * 
	 * @param name Name of the user to greet.
	 */
	
	
	public static void sayHello (String name) {
		System.out.printf("Hello, %s!\n", name);
	}
	

	public static void main(String[] args) {
//		sayHello();
//		sayHello("edin");
//		sayHello(args[0]);
		
//		for (int i = 0; i < args.length; i++) {    // klasicna for petlja
//			String name = args[i];
//			sayHello(name);
//		}
//		
//		for (String name : args) {  	// for each petlja
//			sayHello(name);
//		}
		
		int sum = 0;
		
		// varijanta 1
		
		for (String num : args) {
			int n = Integer.parseInt(num);
			sum+=n;
		} 
		
		System.out.println("Zbir je: " + sum);
		
		// varijanta 2
		
		for (int i = 0; i < args.length; i++) {
			String num = args[i];
			int n = Integer.parseInt(num);
			sum+=n;
		}
		
		System.out.println("Zbir je: " + sum);
		
	}

}
