package examples;

import java.util.Scanner;

public class ScannerAndStringExample {

	public static void main(String[] args) {

		String line = "Oh, boy! Bob is a really cool boy.";
		//		
		//		String[] splitLine = line.split("\\s+");
		//
		//		for(int i = 0; i < splitLine.length; i++) {
		//			System.out.println(splitLine[i]);
		//			
		//		}

		Scanner lineScanner = (new Scanner(line));//.useDelimiter("b");		
		int i = 0;
		while(lineScanner.hasNext()) {
			String word = lineScanner.next();		
			String upperWord = word.toUpperCase();

			System.out.println("Word " + i + ": " + upperWord);
			i++;
		}
		System.out.println("Number of words: " + i);

	}

}
