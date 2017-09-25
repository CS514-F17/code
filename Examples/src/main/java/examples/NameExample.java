package examples;

public class NameExample {

	public static void main(String[] args) {

		Name n1 = new Name("Bob", "Jones");
		Name n2 = new Name("Bob", "Jones");
		n2.setFirstName("Robert");
		
		if(n1.equals(n2)) { //==
			System.out.println("Same names!");
		} else {
			System.out.println("Different names!");
		}
		
	}

}
