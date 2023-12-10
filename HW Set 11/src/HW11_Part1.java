import java.util.Scanner;

public class HW11_Part1 {

	public static void selectionSort(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			int minIdx = i;
			for (int j = i; j < strArr.length; j++) {
				if (strArr[minIdx].compareTo(strArr[j]) > 0)
					minIdx = j;
			}
			if (i != minIdx) {
				String t = strArr[i];
				strArr[i] = strArr[minIdx];
				strArr[minIdx] = t;
			}
		}
	}
	
	public static int linearSearch(String[] strArr, String key) {
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equals(key))
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(String[] strArr, String key) {
		int min = 0, max = strArr.length-1;
		while (min <= max) {
			int m = (max - min)/2;
			int comparison = strArr[m].compareTo(key);
			if (comparison == 0) return m;
			if (comparison > 0) min = m+1;
			else max = m-1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strArr = new String[6];
		
		System.out.printf("Please input %d words: ", strArr.length);
		int wordsLeft = strArr.length;
		while (input.hasNext()) {
			strArr[strArr.length - wordsLeft] = input.next();
			if (--wordsLeft <= 0) break;
		}
		input.close();
		
		System.out.println(linearSearch(strArr, "cs"));
		selectionSort(strArr);
		System.out.println(binarySearch(strArr, "math"));
		
		
	}

}
