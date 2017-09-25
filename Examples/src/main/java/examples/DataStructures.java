package examples;

import java.util.HashMap;

public class DataStructures {

	public static void main(String[] args) {
		
		HashMap<String, Integer> phoneNums = new HashMap<>();
		
		phoneNums.put("Sami", 2024);
		int result = phoneNums.get("Sami");
		
		System.out.println(result);
		
		phoneNums.put("Sami", 9876);
		result = phoneNums.get("Sami");
		System.out.println(result);
		
	}
	
}
