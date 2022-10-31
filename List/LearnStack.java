package List;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {

		Stack<String> animals = new Stack<>();
// Pinciple => First In Last Out (LIFO)
		animals.push("Lion"); //Insertion on Stack
		animals.push("Tiger");
		animals.push("Fox");
		animals.push("Elephent");
		animals.push("Deer");
		
		System.out.println(animals);
	
		System.out.println(animals.peek()); //See the FIRST inserted element on Stack
		
		System.out.println(animals.pop()); //Delation of FIRST inserted element from Stack 
	}

}
