
public class RecursionFun {


	public static int factorialIterative(int n) {

		int factorial = 1;

		for(int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;

	}


	public static int factorial(int n) {

		//TODO: what happens if n is 0 or negative?

		if(n == 1) {
			return 1;
		}

		return (n * factorial(n-1));

	}

	public static void printNums(int n) {

		//print numbers from 0-n without using a helper method
		//		if(n == 0) {
		//			System.out.print(n);
		//			return;
		//		} 
		//		printNums(n-1);
		//		System.out.print(n);		

		//print numbers from 0-n using a helper method
		printNums(0, n);

	}	

	private static void printNums(int current, int end) {

		if(current == end) {
			System.out.print(current);
			return;
		}		
		System.out.print(current);
		printNums(current+1, end);

	}

	public static void printString(String s) {
		//TODO: what if length is 0?
		if(s.length() == 1) {
			System.out.println(s);
			return;
		}
		printString(s.substring(1));
		System.out.println(s.charAt(0));
	}

	public static int countAs(String s) {
	
		if(s.length() == 0) {
			return 0;
		}
//		int returnVal = countAs(s.substring(1));
		if(s.charAt(0) == 'a') {
			return 1 + countAs(s.substring(1));
		}
		return countAs(s.substring(1));
		
		
		
//		if(s.length() == 1) {
//			if(s.charAt(0) == 'a') {
//				return 1;
//			} else {
//				return 0;
//			}
//		}
//		if(s.charAt(0) == 'a') {
//			return 1 + countAs(s.substring(1));
//		} else {
//			return countAs(s.substring(1));
//		}
		
		
	}

	public static boolean contains(String s, char c) {
		
		if(s.isEmpty()) {
			return false;
		}
		
		if(s.charAt(0) == c) {
			return true;
		}
		return contains(s.substring(1), c);
		
	}

	
	public static void main(String[] args) {
		//		System.out.println(factorial(3));
		//		printNums(5);
		//		printString("cat");
//		System.out.println(countAs("dog"));
		System.out.println(contains("cat", 't'));
	}

}
