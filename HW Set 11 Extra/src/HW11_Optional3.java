
public class HW11_Optional3 {

	public static void print2dArray(int[][] array, int perLine) {
		int lineCount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d ", array[i][j]);
				if (++lineCount >= perLine) {
					System.out.println();
					lineCount = 0;
				}
			}
		}
	}
	
	public static int[][] create2dArray(int m, int n){
		int[][] array = new int[n][m];
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i % 2 == 0)
					array[i][j] = i*m + j + 1;
				else
					array[i][j] = i*m + m - j;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[][] array = create2dArray(5,7);
		print2dArray(array, array[0].length);
	}

}
