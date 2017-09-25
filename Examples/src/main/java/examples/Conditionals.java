package examples;

public class Conditionals {

	public static void main(String[] args) {
	
		String alpha = "CSROCKS";
		//if length of alpha is not 7, print invalid
		//otherwise print valid
		
		if(alpha.length() != 7) {
			System.out.println("Invalid");
		} else {
			System.out.println("Valid");			
		}		
		
	}
	
}
