import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator; 
import java.util.List;


import Set.Student;

public class LearnCollectionClass {

	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
//		
//		list.add(25);
//		list.add(65);
//		list.add(78);
//		list.add(9);
//		list.add(9);
//		list.add(100);
//		list.add(6);
//		
//		System.out.println("Max element "+ Collections.max(list));
//
//		System.out.println("Min element "+ Collections.min(list));
//	   
//		System.out.println("Frequency "+ Collections.frequency(list, 9));
//
//		Collections.sort(list);	
//		
//		System.out.println(list);
//		
//		Collections.sort(list, Comparator.reverseOrder());
//	
//		System.out.println(list);
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Sunny", 2));
		list.add(new Student("Sibun", 4));
		list.add(new Student("Sita", 3));
		list.add(new Student("Sahil", 1));
		
		Student s1 = new Student("Sunny", 2);
		Student s2 = new Student("Salman", 3);

//		System.out.println(s1.compareTo(s2));
		
		
		Collections.sort(list,(o1, o2) -> o1.name.compareTo(o2.name));
		
//		Collections.sort(list, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		});
		System.out.println(list);
		
	}

}
