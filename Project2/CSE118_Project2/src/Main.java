import java.util.Scanner;

public class Main {

	private static final String menuString =
		"1. Triangle patterns\n"+
		"2. Pyramid patterns\n"+
		"3. Diamond patterns\n"+
		"4. Exit";
	
	
	/**
	 * Validates that a string contains a valid integer within the given range (inclusive)<br>
	 * * Note: Not meant to handle negative values, -1 is used as default return in case of error
	 * @param str The string to be validated
	 * @param min Minimum valid integer
	 * @param max Maximum valid integer
	 * @returns Returns integer value if valid, otherwise returns -1
	 */
	private static int validateInt(String str, int min, int max) {
		try {
			int in = Integer.parseInt(str);
			if (in >= min && in <= max) return in;
		}
		catch (NumberFormatException e) {}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean loopProgram = true;
		
		while (loopProgram) {
			System.out.println(menuString);
			
			int selection = -1;
			while (true) {
				System.out.print("Enter selection: ");
				selection = validateInt(input.nextLine().trim(), 1, 4);
				if (selection != -1) break;
				System.out.println("Error: Value must be between 1 - 4");
			}
			
			int n = -1;
			while (true) {
				System.out.print("Enter an integer value between 1 - 9: ");
				n = validateInt(input.nextLine().trim(), 1, 9);
				if (n != -1) break;
				System.out.println("Error: Value must be between 1 - 9");
			}
			
			switch (selection) {
			case 1: // Triangle
				Patterns.PrintTriangles(n);
				break;
				
			case 2: // Pyramid
				Patterns.PrintPyramids(n);
				break;
				
			case 3: // Diamond
				Patterns.PrintDiamonds(n);
				break;
				
			case 4: // Exit
				loopProgram = false;
				break;
				
			default:
				System.out.println("*Error: selection invalid");
				break;
			
			}
		}
		input.close();
		System.out.println("Program terminated");
	}

}
