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
public class DataProcessorRedesign {
	
	//declare data member to hold list of numbers
	private ArrayList<Integer> numbers;
	
	/**
	 * Constructor
	 * @param filename
	 */
	public DataProcessorRedesign(String filename) {
		//initialize data member
		this.numbers = new ArrayList<Integer>();
		//read numbers from file and populate list
		try(Scanner input = new Scanner(new File(filename))) {
			
			while(input.hasNext()) {
				int nextInt = input.nextInt();
				numbers.add(nextInt);			
			}

		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}		
		
	}
	
	/**
	 * Return the minimum of all number is the list.
	 * @return
	 */
	public int getMin() {
		//initialize to first number!
		int min = numbers.get(0); 
		
		for(int i = 0; i < numbers.size(); i++) {
			int value = numbers.get(i);
			if(value < min) {
				min = value;
			}		
		}
		return min;
	}
	
	/**
	 * Return the average of all numbers in the list.
	 * @return
	 */
	public double getMean() {
		int sum = 0;
		
		for(int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}	
		return ((double) sum)/numbers.size();
	}
	
}
