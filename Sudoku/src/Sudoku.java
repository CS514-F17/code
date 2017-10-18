
/**
 * A class with some basic functionality of a Sudoku game.
 * @author srollins
 *
 */
public class Sudoku {

	//board is a two dimensional array of ints
	private int[][] board;

	/**
	 * Return true if the board is complete and valid and false otherwise.
	 * @return
	 */
	public boolean check() {
		//if rows, squares, and columns all have 1-9 then return true
		return checkRows() && checkCols() && checkSquares();
	}

	/**
	 * Return true if all subsquares contain all numbers 1-9.
	 * @return
	 */
	private boolean checkSquares() {
		
		for(int r = 0; r < board.length; r += 3) {
			for(int c  = 0; c < board[r].length; c += 3) {		
				
				for(int i = 1; i <= 9; i++) {
					boolean found = false;
					
					for(int j = r; j < r+3; j++) {
						for(int k = c; k < c+3; k++) {
							if(board[j][k] == i) {
								found = true;
								break;
							}
						}
						if(found){ 
							break;						
						}
					}
					if(!found) {
						return false;
					}					
				}			
			}
		}
		return true;
	}

	/**
	 * Return true if every row contains all numbers 1-9
	 * @return
	 */
	private boolean checkRows() {
		//TODO: Complete method
		//for every row - r
		//	for every number 1-9 - i
		//		found = false;
		//		for every column in the row - c
		//			if board[r][c] == i
		//				found = true
		//				break
		//		if !found
		//			return false
		//return true;
		
		for(int r = 0; r < board.length; r++) {	//for every row		
			for(int i = 1; i <= 9; i++) {
				boolean found = false;
				for(int c = 0; c < board[r].length; c++) { //for every column
					if(board[r][c] == i) {
						found = true;
						break;
					}
				}
				if(!found) {
					return false;
				}
			}
		}		
		return true;		
	}

	/**
	 * Return true if every column contains all numbers 1-9.
	 * @return
	 */
	private boolean checkCols() {
		
		for(int c = 0; c < board.length; c++) {	//for every column		
			for(int i = 1; i <= 9; i++) {
				boolean found = false;
				for(int r = 0; r < board.length; r++) { //for row in column
					if(board[r][c] == i) {
						found = true;
						break;
					}
				}
				if(!found) {
					return false;
				}
			}
		}		
		return true;		

	}
	
	/**
	 * Helper method that returns true if the board is full and false otherwise.
	 * @return
	 */
	private boolean isFull() {
		
		for(int r = 0; r < board.length; r++) {			
			for(int c = 0; c < board[r].length; c++) {
				if(board[r][c] == 0) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	/**
	 * Use a recursive backtracking algorithm to solve this puzzle.
	 * Warning: this will take forever if the board has many empty slots!
	 * @return
	 */
	public boolean solve() {
		//if board is full
		// 	return check
		if(isFull()) {
			return check();
		}
		
		//find the next empty position
		for(int r = 0; r < board.length; r++) {			
			for(int c = 0; c < board[r].length; c++) {
				if(board[r][c] == 0) {
					//for each possible value (1-9)
					for(int i = 1; i <= 9; i++) {
						//	set the position to have the value
						board[r][c] = i;
						//	result = recurse
						boolean result = solve();
						//	if result
						//		return true
						if(result) {
							return true;
						}
					}
					//reset the cell to be 0
					//return false
					board[r][c] = 0;
					return false;
				}				
			}
		}
		return false;		
	}

	/**
	 * Utility method to print the board.
	 */
	public void printBoard() {
		System.out.println("****************");
		
		for(int[] row: board) {
			for(int i: row) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		System.out.println("****************");
	}
	
	
	/**
	 * Constructor for testing purposes.
	 * Takes as input a string containing the board
	 * and stores the values in the array.
	 * A blank square is represented by a 0.
	 * Rows are separated by newlines and each int
	 * is separated by a |/
	 * @param test
	 */
	public Sudoku(String test) {
		board = new int[9][9];
		
		//TODO: what if the input string is incorrectly formatted?
		String[] lines = test.split("\n");
		int r = 0;
		for(String line: lines) {
			String[] nums = line.split("\\|");
			int c = 0;
			boolean isFirst = true;
			for(String num: nums) {
				//line starts with the delimiter so 
				//the first string will be empty
				if(isFirst) {
					isFirst = false;
					continue; 
				}
				if(num.trim().isEmpty()) {
					board[r][c++] = 0;
				} else {
					board[r][c++] = Integer.parseInt(num);
				}
			}
			r++;			
		}
		
	}

}
