
@FunctionalInterface
interface PatternFunc {
	int run(int n, int i, int j);
}

public class Patterns {
	
	public static void printArray2d(int[][] array, boolean xInvert, boolean yInvert) {
		for (int j = 0; j < array[0].length; j++) {
			for (int i = 0; i < array.length; i++) {
				int x = (xInvert)? array.length-1 - i : i;
				int y = (yInvert)? array[0].length-1 - j : j;
				int val = array[x][y];
				System.out.print((val > 0)? (char)(val+'0') : ' ');
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printArray2d(int[][] array) {
		printArray2d(array, false, false);
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
	
	public static int[][] createDiamond(int n, PatternFunc func){
		int columns = 2*n-1, rows = columns;
		int[][] diamond = new int[columns][rows];
		
		for (int i = 0; i < columns; i++) {
			int space = Math.abs(i - (n-1));
			for (int j = space; j < rows - space; j++) {
				diamond[i][j] = func.run(n,i,j);
			}
		}
		return diamond;
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
		printArray2d(pyramidA, false, true);
		printArray2d(pyramidB, false, true);
	}
	
	public static void printDiamonds(int n) {
		PatternFunc a = (int _n, int i, int j) -> {
			int space = Math.abs(i - (n-1));
			if (j < n) return j+1 - space;
			return n - (j+1)%n - space;
		};
		PatternFunc b = (int _n, int i, int j) -> {
			int space = Math.abs(j - (n-1));
			if (i < n) return i+1 ;
			return n - (i+1)%n;
		};
		PatternFunc c = (int _n, int i, int j) -> {
			int space = Math.abs(i - (n-1));
			if (j < n) return j+1 ;
			return n - (j+1)%n;
		};
		PatternFunc d = (int _n, int i, int j) -> {
			int space = Math.abs(j - (n-1));
			if (i < n) return n - i ;
			return i - n + 2;
		};
		
		int[][] diamondA = createDiamond(n, a);
		int[][] diamondB = createDiamond(n, b);
		int[][] diamondC = createDiamond(n, c);
		int[][] diamondD = createDiamond(n, d);

		printArray2d(diamondA);
		printArray2d(diamondB);
		printArray2d(diamondC);
		printArray2d(diamondD);
	}
	
}
