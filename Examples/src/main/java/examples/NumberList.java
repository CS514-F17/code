package examples;

public class NumberList {

	private int[] numbers;
	private int count;

	public NumberList() {		
		this.numbers = new int[2];
		this.count = 0;
	}
	
	public NumberList(int[] initialItems, int numberInitialItems) {
		//copy all of the initialItems into numbers
		
		//set count to be numberInititalItems
		
	}
	
	/**
	 * Create a new array of twice the size 
	 * and copy over all items.
	 */
	private void resize() {
		
		//create a new array of twice the size of the original
		int[] newArray = new int[count*2];
		//int[] newArray = new int[count+1];
		//int[] newArray = new int[count*10];
		//int[] newArray = new int[numbers.length*2];
		
		//copy everything from original into new
		for(int i = 0; i < count; i++) {
			newArray[i] = this.numbers[i];
		}
		
		//move numbers reference to new array
		this.numbers = newArray;
		
	}
		
	public void addFirst(int newNumber) {
		
		//if list is full, resize
		if(count == numbers.length) {
			resize();
		}		
		
		//move all existing items down one slot
		for(int i = count; i > 0; i--) {			
			numbers[i]= numbers[i-1];			
		}
		
		//add new item at beginning of the list
		numbers[0] = newNumber;
		count++;
				
	}
	
	public void removeFirst() throws EmptyListException {
	
		if(count == 0) {
//			return;
			EmptyListException ele = new EmptyListException("Cannot remove first item from an empty list.");
			throw ele;
			
			//throw new EmptyListException("message");
		}
		
		for(int i = 0; i < count-1; i++) {
			numbers[i] = numbers[i+1];			
		}
		count--;
	}
	
	public String toString() {
		String result = "";
		
		//build a string representation of the list
		for(int i = 0; i < count; i++) {
			result += numbers[i] + " ";
		}
		
		return result;
	}
	
}
