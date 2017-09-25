package examples;

public class NumberListDriver {

	public static void main(String[] args) {
		NumberList nl = new NumberList();
		nl.addFirst(29);
		nl.addFirst(5);		
		System.out.println(nl);
		System.out.println("**********");
		
		try {
			nl.removeFirst();
			System.out.println("1: Successful call to removeFirst");
		} catch (EmptyListException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(nl);
		System.out.println("**********");
		try {
			nl.removeFirst();
			System.out.println("2: Successful call to removeFirst");
		} catch (EmptyListException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(nl);
		System.out.println("**********");
		try {
			nl.removeFirst();
			System.out.println("3: Successful call to removeFirst");
		} catch (EmptyListException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(nl);
		nl.addFirst(33);
		nl.addFirst(44);		
		System.out.println("**********");
		System.out.println(nl);
	}

}
