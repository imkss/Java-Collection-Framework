package Set;

import java.util.HashSet;
import java.util.Set;

public class CustomSet {

	public static void main(String[] args) {
		
		Set<Student> stdSet = new HashSet<>();
		
		stdSet.add(new Student("Sunny", 2));
		stdSet.add(new Student("Sagar", 25));
		stdSet.add(new Student("Sahil", 22));
		stdSet.add(new Student("Sonu", 32));
		
		stdSet.add(new Student("Saurav", 2));
		
		System.out.println(stdSet);
	}

}
