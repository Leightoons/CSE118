
public class HW10_Part1 {

	public static void main(String[] args) {
		int[] array = new int[48];
		
		for (int i = 0; i < array.length; ) {
			array[i] = (int)(Math.random()*203)-101;
			System.out.printf("%4d ", array[i]);
			if (++i % 8 == 0) System.out.println();
		}
		
		int min = array[0], max = min;
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			sum += array[0];
			if (array[i] > max) max = array[i];
			else if (array[i] < min) min = array[i];
		}
		double avg = (double)sum / array.length;
		
		int minCount = 0, maxCount = 0, abvAvg = 0;
		for (int n : array) {
			if (n == min) ++minCount;
			if (n == max) ++maxCount;
			if (n > avg) ++abvAvg;
		}
		
		System.out.printf("The largest element is %d. There are %d %d's in the array.\n", max, maxCount, max);
		System.out.printf("The smallest element is %d. There are %d %d's in the array.\n", min, minCount, min);
		System.out.printf("The average of all elements is %f. ", avg);
		System.out.printf("There are %d elements greater than the average.\n", abvAvg);
		
		//shift array right +1
		int t = array[array.length-1];
		for (int i = array.length-1; i > 0; i--)
			array[i] = array[i-1];
		array[0] = t;
		
		for (int i = 0; i < array.length; ) {
			System.out.printf("%4d ", array[i]);
			if (++i % 8 == 0) System.out.println();
		}
	}

}
