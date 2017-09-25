package examples;

public class Iteration {

	public static void main(String[] args) {

		//for
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
		//while
//		int i = 0;
//		while(i < 10) {
//			System.out.println(i++);
//		}
//		
		String alpha = "CSROCKS";
		for(int i = 0; i < alpha.length(); i++) {
			char c = alpha.charAt(i);
			System.out.println(c);
		}
	
	}

}
