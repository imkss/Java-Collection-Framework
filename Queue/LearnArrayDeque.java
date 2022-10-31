package Queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
//		Doubly Ended Queue: Application can be done from both the ended
		
		adq.offerFirst(101); // Insert element in FRONT
		adq.offer(23); // Insert element in END
		adq.offer(2); 
		adq.offerLast(8); // Insert element in END
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peek());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.poll());
		System.out.println("poll " + adq);
		System.out.println(adq.pollFirst());
		System.out.println("poll First " +adq);
		System.out.println(adq.pollLast());
		System.out.println("poll Last " +adq);
	}

}
