package webservices;

public class Main {
	
	//main class
	public static void main(String args[]) {
		try {
			System.out.println("Start.");
			System.out.println("Webservice is open.");
			System.out.println("Primary class.");
			System.out.println("secondary class.");
			
				//execution of static primary and secondary class.
				primary();
				secondary();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
	//primary class and is not the main class.
	public static void primary() {
		try {
			System.out.println("Primary start.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
	//secondary class.
	public static void secondary() {
		try {
			System.out.println("Secondary start.");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
}