
public class HW11_Optional1 {

	public static void print2dArray(int[][] array, int perLine) {
		int lineCount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%4d ", array[i][j]);
				if (++lineCount >= perLine) {
					System.out.println();
					lineCount = 0;
				}
			}
		}
	}
	
	public static int[] array2dGetMinMax(int[][] array) {
		int min = array[0][0], max = min;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int n = array[i][j];
				if (n > max) max = n;
				else if (n < min) min = n;
			}
		}
		return new int[] {min, max};
	}
	
	public static double array2dGetAverage(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		int size = array.length * array[0].length;
		return sum/(double)size;
	}
	
	public static int array2dCountAboveValue(int[][] array, double value) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > value) ++count;
			}
		}
		return count;
	}
	
	public static int array2dCountAboveAvg(int[][] array) {
		double avg = array2dGetAverage(array);
		return array2dCountAboveValue(array, avg);
	}
	
	public static int[] array2dGetMinIndex(int[][] array) {
		int[] idx = new int[2];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int n = array[i][j];
				int m = array[idx[0]][idx[1]];
				if (n < m) {
					idx[0] = i;
					idx[1] = j;
				}
			}
		}
		return idx;
	}
	
	public static void main(String[] args) {
		int[][] array = new int[6][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random()*99)+1; //[1,99]
			}
		}
		
		// find min and max
		int[] minMax = array2dGetMinMax(array);
		System.out.printf("Minimum element: %d\n", minMax[0]);
		System.out.printf("Maximum element: %d\n", minMax[1]);
		
		// find avg
		double avg = array2dGetAverage(array);
		System.out.printf("Average of elements: %f\n", avg);
		
		// count above avg
		int abvAvg = array2dCountAboveValue(array, avg);
		System.out.printf("Elements greater than average: %d\n", abvAvg);
		
		print2dArray(array, array[0].length);
		
		// find min element index
		int[] minIdx = array2dGetMinIndex(array);
		System.out.printf("Index of minimum element: [%d][%d]\n", minIdx[0],minIdx[1]);
		System.out.println(array[minIdx[0]][minIdx[1]]);
	}

}
