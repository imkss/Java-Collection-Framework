package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		
//		Map<String, Integer> numbers = new HashMap<>(); //Having KEY-VALUE pair & Key are always Unique.
		Map<String, Integer> numbers = new TreeMap<>(); //Sort KEY since it's importing TreeSet
		
		numbers.put("One", 1); // Insert the Key&Value Pair
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Five", 5);
		
		
		
		numbers.put("Two", 22); //If we again put the value, It will get OVERRIDE
		
		numbers.putIfAbsent("One", 11);
		
		if(!numbers.containsKey("Two")) {
		System.out.println(numbers);
		}
		
		System.out.println(numbers);
		
		
		for(String key: numbers.keySet()) {
			System.out.print(key+ " ");
		}
		System.out.println();
		for(Integer value: numbers.values()) {
			System.out.print(value + " ");
		}
	}
}
