package List;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

	public static void main(String[] args) {

		ArrayList<String> std = new ArrayList<>();

		std.add("Rakesh");
		std.add("Shila");

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1); // ADD elements in the END
		list.add(11);
		list.add(21);
		list.add(31);
		list.add(41);
		list.add(51);
		list.add(61);

		System.out.println(list);

		list.add(3, 25); // ADD element at the specific place
		System.out.println(list);

		list.set(2, 71); // UPDATE the value at the given position
		System.out.println(list);

		System.out.println(list.contains(11)); //CHECK if the value is present or not in the LIST
		
		System.out.println(list.size()); //Give the number of the elements in the ArrayList
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Element :: "+ list.get(i));
		}
		
		for(Integer value: list) {
			System.out.println("#For_Each Element :: "+ value);
		}
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("#Iterator Element :: "+ it.next());
		}
		
		  ArrayList<Integer> newList = new ArrayList<>();
		  
		  newList.add(69); newList.add(100);
		  
		  list.addAll(newList); //ADD two SAME TYPE of ArrayList
		  System.out.println(list);
		  
		  System.out.println(list.get(1)); //To get the value from ArrayList
		  
		  System.out.println(list.remove(0)); //INDEX wise element deletation
		  
		  list.remove(Integer.valueOf(100)); //VALUE wise element deletation
		  System.out.println(list);
		  
		  list.clear(); //DELETE the entire LIST System.out.println(list);
		 

	}
}
