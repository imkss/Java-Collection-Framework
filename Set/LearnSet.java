package Set;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
//		Elements never repeats			
//		Set<Integer> set = new HashSet<>(); //Element get shuffled		
//		Set<Integer> set = new LinkedHashSet<>(); //Element will get in serial manner as it was inserted, since it also following properties of LinkedList
		Set<Integer> set = new TreeSet<>(); //Elements are now being sorted, since its importing properties of TreeSet
		
		/*
		 * [Time Complaxity] 
		 * HashSet : O(1)
		 * LinkedHashSet : O(n)
		 * TreeSet : Ologn
		 */
		
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		
		set.add(54); //Will not inserted again

		System.out.println(set);
		
		set.remove(54);
		System.out.println(set);
		
		System.out.println(set.contains(100));

		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		set.clear();
		
		System.out.println(set);

		
	}

}
