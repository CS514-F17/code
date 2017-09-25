package examples;

import java.io.IOException;
import java.util.Scanner;

/**
 * Here is a class that ...
 * @author srollins
 *
 */
public class CmdInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me some text:");
		String value = input.nextLine();
		
		int intVal = Integer.parseInt(value);
		
		System.out.println("You said - " + intVal);
	
	}

}
