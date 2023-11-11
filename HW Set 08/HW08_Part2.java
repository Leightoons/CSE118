import java.util.Scanner;

public class HW08_Part2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a string of text: ");
		String str = input.nextLine();
		input.close();
		
		int len = str.length();
		
		// Count whitespace
		int i = 0;
		int wsCount = 0;
		while (i < len) {
			if (Character.isWhitespace(str.charAt(i)))
				wsCount++;
			i++;
		}
		System.out.printf("The given string contains %d whitespace characters.\n", wsCount);
		
		// Count digits
		i = 0;
		int digitCount = 0;
		do {
			if (len == 0) break; // prevents crashing from accessing invalid string index
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9')
				digitCount++;
			i++;
		}
		while (i < len);
		System.out.printf("The given string contains %d digital characters.\n", digitCount);
		
		// Count letters
		int upperCount = 0, lowerCount = 0;
		for (i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') upperCount++;
			else if (ch >= 'a' && ch <= 'z') lowerCount++;
		}
		int letterSum = upperCount + lowerCount;
		System.out.printf("The given string contains %d letter characters; %d uppercase and %d lowercase\n", letterSum, upperCount, lowerCount);
	}
}
