
public class Driver {

	public static void main(String[] args) {

		FileFinder ff = new FileFinder(".java");
		for(String s: ff.getFiles("/Users/srollins/teaching")) {
			System.out.println(s);
		}
	}

}
