import java.util.ArrayList;

@FunctionalInterface
interface SearchFunc {
	boolean run(int n);
}

public class HW10_Part2 {
	
	// I know you don't want us to use ArrayLists but it was required to create an array with an unknown size
	public static ArrayList<Integer> SearchArray(int[] array, SearchFunc func) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (func.run(array[i])) {
				aList.add(i);
			}
		}
		return aList;
	}
	
	public static void main(String[] args) {
		int arrayLen = (int)(Math.random()*51)+50;
		int[] array = new int[arrayLen];
		System.out.println(arrayLen);
		
		for (int i = 0; i < array.length; ) {
			array[i] = (int)(Math.random()*201)-100;
			System.out.printf("%4d ",array[i]);
			if (++i % 10 == 0) System.out.println();
		}
		System.out.println();
		
		ArrayList<Integer> matches;
		matches = SearchArray(array, (n) -> n == 0);
		for (int idx : matches)
			System.out.printf("0 is found at location %d\n", idx);
		
		matches = SearchArray(array, (n) -> n == 20);
		System.out.printf("The number 20 occurs %d times\n", matches.size());
		
		matches = SearchArray(array, (n) -> n % 2 == 0);
		System.out.printf("There are %d even and %d odd numbers in this array", matches.size(), array.length - matches.size());
	}

}
