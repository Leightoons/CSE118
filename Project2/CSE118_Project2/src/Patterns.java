
@FunctionalInterface
interface PatternFunc {
	int run(int n, int i, int j);
}

public class Patterns {
	
	private static void printArray2d(int[][] array) {
		for (int j = 0; j < array[0].length; j++) {
			for (int i = 0; i < array.length; i++) {
				int val = array[i][j];
				System.out.print((val > 0)? (char)(val+'0') : ' ');
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void printArray2dReverse(int[][] array) {
		for (int j = array[0].length-1; j >= 0 ; j--) {
			for (int i = 0; i < array.length; i++) {
				int val = array[i][j];
				System.out.print((val > 0)? (char)(val+'0') : ' ');
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printTriangles(int n) {
		
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
	
	public static int[][] createPyramid(int n, PatternFunc func){
		int columns = 2*n-1, rows = n;
		int[][] pyramid = new int[columns][rows];
		
		for (int i = 0; i < columns; i++) {
			int space = Math.abs(i - (n-1));
			for (int j = space; j < rows; j++) {
				pyramid[i][j] = func.run(n,i,j);
			}
		}
		return pyramid;
	}
	
	public static void printPyramids(int n) {
		PatternFunc a = (int _n, int i, int j) -> j + 1;
		PatternFunc b = (int _n, int i, int j) -> {
			int space = Math.abs(i - (n-1));
			return j+1 - space;
		};
		
		int[][] pyramidA = createPyramid(n, a);
		int[][] pyramidB = createPyramid(n, b);
		
		printArray2d(pyramidA);
		printArray2d(pyramidB);
		printArray2dReverse(pyramidA);
		printArray2dReverse(pyramidB);
	}
	
	public static void printDiamonds(int n) {
		return;
	}
	
}
