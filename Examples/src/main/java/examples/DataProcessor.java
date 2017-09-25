package examples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DataProcessor {

	public static void main(String[] args) {
		
		//find the min, max, and mean of all values stored
		//in the text file input/scores.txt
				
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//create a path representation of the output file.
		Path outPath = Paths.get("output/grades.txt");
		//if parent directories do not exist, create them
		outPath.getParent().toFile().mkdirs();
		
		//create input/output objects
		try(Scanner input = new Scanner(new File("input/scores.txt"));
				BufferedWriter output = Files.newBufferedWriter(outPath)
			) {
			
			while(input.hasNext()) {
				//read from scores.txt file
				int score = input.nextInt();
				
				//translate score
				String grade = "F";				
				if(score >= 90) {
					grade = "A";
				} else if (score >= 80) {
					grade = "B";
				} else if (score >= 70) {
					grade = "C";
				} 
				//save to file
				output.write(grade + "\n");
				
//				numbers.add(nextInt);
			}

		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}	
		
//		for(int value: numbers) {
//			System.out.println(value);
//		}
		
//		int min = numbers.get(0); 
//				
//		for(int i = 0; i < numbers.size(); i++) {
//			int value = numbers.get(i);
//			if(value < min) {
//				min = value;
//			}
//		
//		}
//		System.out.println("Smallest: " + min);

		
		
	}
}
