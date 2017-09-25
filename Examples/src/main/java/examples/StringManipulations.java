package examples;

public class StringManipulations {

	/**
	 * Replaces all instances of the find character with the replace
	 * character in the input string original and returns the result.
	 * 
	 * @param original
	 * @param find
	 * @param replace
	 * @return
	 */
	public String replace(String original, char find, char replace) {
		String result = new String("");
		for(int i = 0; i < original.length(); i++) {			
			char c = original.charAt(i);
			if(c == find) {
				result = result + replace;
			} else {
				result += c;
			}			
		}
		return result;	
	}
	
	public static void main(String[] args) {
		//some sample code to test the method
//		StringManipulations sm = new StringManipulations();
//		String result1 = sm.replace("yes", 'l', 'X');
//		System.out.println(result1);
		

		String test = "hello\tthere";
		System.out.println(test);
		
		
	}
}
