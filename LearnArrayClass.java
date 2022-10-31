import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args) {
		
//		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
//		int index = Arrays.binarySearch(numbers, 5);
//		System.out.println(index);
		
		Integer[] number = {19,2,1,13,24,56,11,78};
		Arrays.sort(number);
		
		Arrays.fill(number, 11);
		
		for(int i : number) {
			System.out.println(i + " ");
		}
		
		
	}

}
