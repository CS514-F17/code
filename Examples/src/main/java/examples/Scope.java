package examples;

public class Scope {

	public static double calculate(int a, int b) {
		
		double result = ((double)a)/b;
		return result;
	}
		
	public static void main(String[] args) {
				
//		int x = 5;
//		int y = 2;
//		double result = calculate(x, y);
//		System.out.println(result);
		
//		String first = "Bob";
//		String last = "Jones";
//		Name n = getName(first, last);
//		
//		changeName(n, "Robert");
//		System.out.println(n);
		
	}

	public static Name getName(String first, String last) {
		Name name = new Name(first, last);
		return name;
	}
	
	public static void changeName(Name n, String newFirst) {
		n.setFirstName(newFirst);
	}

}
