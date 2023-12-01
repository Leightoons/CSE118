
public class Patterns {
	
	private static void printArray2d(int[][] array) {
		for (int j = 0; j < array[0].length; j++) {
			for (int i = 0; i < array.length; i++) {
				int val = array[i][j];
				System.out.print((val > 0)? (char)(val+'0') : ' ');
			}
			System.out.println();
		}
	}
	
	public static int[][] CreatePyramid(int n){
		int columns = 2*n-1, rows = n;
		int[][] pyramid = new int[columns][rows];
		
		for (int i = 0; i < columns; i++) {
			int space = Math.abs(i - (n-1));
			for (int j = space; j < rows; j++) {
				pyramid[i][j] = j+1;
			}
		}
		
		return pyramid;
	}
	
	public static void PrintTriangles(int n) {
		
		String[] lines = new String[n];

		for (int i = 0; i < n; i++) {
			lines[i] = "";
			for (int j = 0; j <= i; j++) {
				lines[i] += String.valueOf(i+1);
			}
		}
		
		// left down triangle
		for (String line : lines) 
			System.out.printf("%-" + n + "s\n", line);
		System.out.println();
		
		// right down triangle
		for (String line : lines) 
			System.out.printf("%" + n + "s\n", line);
		System.out.println();
		
		// left up triangle
		for (int i = lines.length-1; i >= 0; i--) 
			System.out.printf("%-" + n + "s\n", lines[i]);
		System.out.println();
		
		// right down reversed
		for (int i = 0; i < n; i++) {
			lines[i] = "";
			for (int j = 0; j <= i; j++) {
				lines[i] += String.valueOf(n-i);
			}
		}
		for (String line : lines) 
			System.out.printf("%" + n + "s\n", line);
		System.out.println();
	}
	
	public static void PrintPyramids(int n) {
		// setup pattern A (2A & 2C)
		int columns = 2*n-1, rows = n;
		int[][] patternA = new int[columns][rows];
		
		for (int i = 0; i < columns; i++) {
			int space = Math.abs(i - (n-1));
			for (int j = space; j < rows; j++) {
				patternA[i][j] = j+1;
			}
		}
		
		printArray2d(patternA);
	}
	
	public static void PrintDiamonds(int n) {
		return;
	}
	
}
