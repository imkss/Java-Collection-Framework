package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		
//		Principle :- First In First Out
		
		queue.offer(12); //Inserts element in Queue
		queue.offer(24);
		queue.offer(36);
		queue.offer(48);
		System.out.println(queue);
		
		System.out.println(queue.poll()); //Delete the First Insterted element
		
		System.out.println(queue.peek()); //Peek the Firstly Inserted element
	
	}

}
