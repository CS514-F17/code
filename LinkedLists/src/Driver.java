
public class Driver {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.insertFirst("Hello");
		ll.insertFirst("CS");
		ll.insertFirst("514");
		ll.insertFirst("Class!");
		System.out.println(ll);
//		System.out.println(ll.findIterative("514"));
//		System.out.println(ll.findIterative("NOT THERE"));
		System.out.println(ll.findRecursive("Hello"));
		System.out.println(ll.findRecursive("Class!"));
		System.out.println(ll.findRecursive("514"));
		System.out.println(ll.findRecursive("Not there!"));
	}

}
