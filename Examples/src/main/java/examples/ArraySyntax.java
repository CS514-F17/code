package examples;

public class ArraySyntax {

	public static void main(String[] args) {

		Name[] names = new Name[5];
		
		names[0] = new Name("Bob", "Smith");
		names[1] = new Name("Sally", "Jones");
		names[2] = new Name("Herb", "Zuniga");
		names[3] = new Name("Roger", "Berket");
		names[4] = new Name("Carlos", "Broome");

		for(int i = names.length-1; i >= 0; i--) {
			System.out.println(names[i].getFirstName());
		}
			
		
		
		
//		int[] numbers = new int[10];
//		String[] strings = new String[5];
		
//		numbers[0] = 10;
//		numbers[1] = numbers[0] * 4;
		
		
		
		
		
		
	}

}
