
public class HW11_Optional2 {

	public static void printArray(double[][] array, int perLine) {
		int lineCount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%7f ", array[i][j]);
				if (++lineCount >= perLine) {
					System.out.println();
					lineCount = 0;
				}
			}
		}
	}
	public static void printArray(double[] array, int perLine) {
		int lineCount = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%7f ", array[i]);
			if (++lineCount >= perLine) {
				System.out.println();
				lineCount = 0;
			}
		}
	}
	
	public static double[] convert2dArrayTo1dArray(double[][] array2d) {
		int idxTotal = 0;
		for (double[] a:array2d)
			idxTotal += a.length;
		double[] array1d = new double[idxTotal];
				
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				int idx = array1d.length-1 - --idxTotal;
				array1d[idx] = array2d[i][j];
			}
		}
		return array1d;
	}
	
	public static void main(String[] args) {
		double[][] array2d = new double[6][4];
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				array2d[i][j] = Math.random();
			}
		}
		printArray(array2d, 6);
		System.out.println();
		
		double[] array1d = convert2dArrayTo1dArray(array2d);
		printArray(array1d, 6);
		
		
	}

}
