import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataStructuresExamples {

	/**
	 * List data structure implemented using an array.
	 */
	public static void tryArrayList() {
		
		ArrayList<Name> names = new ArrayList<>();
		
		names.add(new Name("Bob", "Smith"));
		names.add(new Name("Sally", "Sue"));
		names.add(new Name("Bob", "Smith"));
		names.add(new Name("Herb", "Jones"));	
		
		System.out.println(names);
	}
	
	/**
	 * HashMap provides key/value mapping.
	 */
	public static void tryHashMap() {		
		HashMap<String, Name> names = new HashMap<>();
		names.put("bob", new Name("Bob", "Smith1"));
		names.put("herb", new Name("Herb", "Jones"));
		names.put("sally", new Name("Sally", "Sue"));
		names.put("bob", new Name("Bob", "Smith2"));		
		for(String name: names.keySet()) {
			System.out.println(name + " " + names.get(name));
		}
	
	}

	/**
	 * TreeMap provides key/value mapping but maintains sorted key set.
	 */
	public static void tryTreeMap() {		
		TreeMap<String, Name> names = new TreeMap<>();
		names.put("bob", new Name("Bob", "Smith"));
		names.put("sally", new Name("Sally", "Sue"));
		names.put("herb", new Name("Herb", "Jones"));
		names.put("bob", new Name("Bob", "Smith"));		
		for(String name: names.keySet()) {
			System.out.println(name + " " + names.get(name));
		}
	}

	/**
	 * A Set prevents duplicate elements and a TreeSet maintains
	 * a sorted set.
	 */
	public static void tryTreeSet() {		
		TreeSet<Name> names = new TreeSet<>();
		names.add(new Name("Bob", "Smith"));
		names.add(new Name("Sally", "Sue"));
		names.add(new Name("Bob", "Smith"));
		names.add(new Name("Herb", "Jones"));			
		System.out.println(names);
	}
	
	/**
	 * A LinkedHashMap provides key/value mapping but maintains key set
	 * in order in which keys were added.
	 */
	public static void tryLinkedHashMap() {
		LinkedHashMap<String, Name> names = new LinkedHashMap<>();
		names.put("bob", new Name("Bob", "Smith"));
		names.put("herb", new Name("Herb", "Jones"));
		names.put("bob", new Name("Bob", "Smith"));		
		names.put("sally", new Name("Sally", "Sue"));
		System.out.println(names);				
	}
	
	
	public static void main(String[] args) {
		System.out.println("****** - ArrayList - ******");
		tryArrayList();
		System.out.println("****** - HashMap - ******");
		tryHashMap();
		System.out.println("****** - TreeMap - ******");
		tryTreeMap();
		System.out.println("****** - TreeSet - ******");
		tryTreeSet();
		System.out.println("****** - LinkedHashMap - ******");
		tryLinkedHashMap();
	}
	
}