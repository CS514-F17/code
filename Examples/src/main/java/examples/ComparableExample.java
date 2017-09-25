package examples;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {

		//Sample code to demonstrate how the comareTo method
		//works in the String class.
		String s1 = "appleXYZ";
		String s2 = "apple";
		System.out.println(s1.compareTo(s2));
		
		if(s1.compareTo(s2) < 0) {
			System.out.println("s1 comes before s2");
		} else if(s1.compareTo(s2) > 0) {
			System.out.println("s1 comes after s2");
		} else {
			System.out.println("s1 and s2 are the same");
		}
				
		//We can use Collections.sort to sort items
		//in an ArrayList as long as those items
		//implement the Comparable interface.
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("Bob", "Smith"));
		names.add(new Name("Herb", "Zuniga"));
		names.add(new Name("Sally", "Jones"));
		names.add(new Name("Henry", "Smith"));
		names.add(new Name("Jim", "Cortez"));
		
		for(Name n: names) {
			System.out.println(n);
		}
		
		Collections.sort(names);
		System.out.println("************");
		
		for(Name n: names) {
			System.out.println(n);
		}
		

	}

}
