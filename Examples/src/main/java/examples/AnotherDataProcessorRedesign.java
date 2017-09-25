package examples;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A data processing class.
 * @author srollins
 *
 */
public class AnotherDataProcessorRedesign {
	
	//declare data member to hold list of numbers
	private int min;
	private int max;
	
	/**
	 * Constructor
	 * @param filename
	 */
	public AnotherDataProcessorRedesign(String filename) {
		
		int min = 0;
		int max = 0;
		boolean isFirstIteration = true;
		
		//read numbers from file and populate list
		try(Scanner input = new Scanner(new File(filename))) {

			while(input.hasNext()) {
				int nextInt = input.nextInt();
				
				if(isFirstIteration) {
					min = nextInt;
					max = nextInt;
					isFirstIteration = false;
				}				
				
				if(nextInt < min) {
					min = nextInt;
				}
				if(nextInt > max) {
					max = nextInt;
				}
//				numbers.add(nextInt);			
			}

		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}		
		
		this.max = max;		
		this.min = min;
	}

//	/**
//	 * Return the minimum of all number is the list.
//	 * @return
//	 */
//	private int getMin(ArrayList<Integer> numbers) {
//		//initialize to first number!
//		int min = numbers.get(0); 
//		
//		for(int i = 0; i < numbers.size(); i++) {
//			int value = numbers.get(i);
//			if(value < min) {
//				min = value;
//			}		
//		}
//		return min;
//	}

	
	/**
	 * Return the minimum of all number is the list.
	 * @return
	 */
	public int getMin() {
		
		return this.min;
		
//		//initialize to first number!
//		int min = numbers.get(0); 
//		
//		for(int i = 0; i < numbers.size(); i++) {
//			int value = numbers.get(i);
//			if(value < min) {
//				min = value;
//			}		
//		}
//		return min;
	}
	
//	/**
//	 * Return the average of all numbers in the list.
//	 * @return
//	 */
//	public double getMean() {
//		int sum = 0;
//		
//		for(int i = 0; i < numbers.size(); i++) {
//			sum += numbers.get(i);
//		}	
//		return ((double) sum)/numbers.size();
//	}
//	
}
