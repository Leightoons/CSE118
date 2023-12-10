
public class Test2 {
	
	public static int linearSearch(int[] array, int n) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] array, int n) {
		int[] range = new int[] {0, array.length-1};
		int mid;
		
		while (range[0] <= range[1]) {
			mid = (range[0] + range[1]) / 2;
			int comparison = array[mid] - n;
			System.out.printf("%",mid);
			if (comparison == 0) {
				return mid;
			}
			
			if (comparison < 0) {
				range[0] = mid+1;
			}
			else {
				range[1] = mid-1;
			}
		}
		return -1;
	}
	
	public static void selectionSort(int[] array) {
		
		for (int i = 0; i < array.length-1; i++) {
			int minIdx = array[i];
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIdx]) minIdx = j;
			}
			if (minIdx != i) {
				int t = array[i];
				array[i] = array[minIdx];
				array[minIdx] = t;
			}
		}
	}
	
	public static int getCharOccurance(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) ++count;
		}
		return count;
	}
	
	public static int[] getLetterOccurance(String s) {
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 'a'; j <= 'z'; j++) {
				char c = Character.toLowerCase(s.charAt(i));
				if (c == j) ++count[c-'a'];
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,3,7,5,2,6,9,0,8,4};
		for (int i : a) System.out.println(i);
		
		System.out.println();
		
		selectionSort(a);
		for (int i : a) System.out.println(i);
	}

}
