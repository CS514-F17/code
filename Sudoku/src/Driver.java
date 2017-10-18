
public class Driver {

	public static void main(String[] args) {

		String test = 
				"|8|6|1|7|2|9|4|5|3|\n" + 
				"|4|9| |3|6|5|1|7|8|\n" + 
				"|5|7|3|1|4|8|6|2|9|\n" + 
				"|1|4|9|5|8|3|2|6|7|\n" + 
				"|2|3|7|9|1|6|8|4|5|\n" + 
				"|6|5|8|2|7|4|3|9|1|\n" + 
				"|3|1|5|6|9|2|7|8|4|\n" + 
				"|9|2|4|8|3|7|5|1|6|\n" + 
				"|7|8|6|4|5|1|9|3| |";
		Sudoku s = new Sudoku(test);
		s.printBoard();
		System.out.println(s.check());
		s.solve();
		s.printBoard();
		System.out.println(s.check());
	}	

}
