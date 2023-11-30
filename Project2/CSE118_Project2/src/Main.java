import java.util.Scanner;
//import patterns.*;

public class Main {

	private static final String menuString =
		"1. Triangle patterns\n"+
		"2. Pyramid patterns\n"+
		"3. Diamond patterns\n"+
		"4. Exit";
	
	
	/**
	 * Validates that a string contains a valid integer within the given range (inclusive)<p>
	 * Not meant to handle negative values, -1 is reserved as error default return
	 * @param str The string to be validated
	 * @param min Minimum valid integer
	 * @param max Maximum valid integer
	 * @returns Returns integer value if valid, otherwise returns -1
	 */
	private static int validateInt(String str, int min, int max) {
		try {
			int in = Integer.parseInt(str);
			
			if (in >= min && in <= max)
				return in;
		}
		catch (NumberFormatException e) {}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int selection = -1;
		System.out.println(menuString);
		while (true) {
			System.out.print("Enter selection: ");
			selection = validateInt(input.nextLine().trim(), 1, 4);
			if (selection != -1) break;
			System.out.println("Error: Value must be between 1 - 4");
		}
		
	}

}
