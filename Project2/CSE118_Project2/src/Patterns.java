
public class Patterns {
	
	public static void PrintTriangles(int n) {
		
		String[] lines = new String[n];
		for (int i = 0; i < lines.length; i++) 
			lines[i] = "";
		
		for (int i = 0; i < n; i++) {
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
		for (int i = lines.length-1; i <= 0; i--) 
			System.out.printf("%-" + n + "s\n", lines[i]);
		System.out.println();
		
		// right up triangle
		for (int i = lines.length-1; i >= 0; i--) 
			System.out.printf("%" + n + "s\n", lines[i]);
		System.out.println();
	}
	
	public static void PrintPyramids(int n) {
		return;
	}
	
	public static void PrintDiamonds(int n) {
		return;
	}
	
}
