import java.util.Scanner;

public class HW07_Part3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string with multiple words: ");
		String str = input.nextLine().trim();
		
		int idx = str.indexOf(' ');
		if (idx < 0)
			System.out.print("Error: String must contain at least two words.");
		else {
			String w1 = str.substring(0, idx);
			idx = str.lastIndexOf(' ');
			String w2 = str.substring(idx+1);
			System.out.printf("First word: \"%s\"\nLast word:  \"%s\"\n", w1,w2);
			
			String newStr = w1+' '+w2;
			int comp = w1.compareTo(w2);
			if (comp == 0) {
				System.out.println("Both words are equal.");
			}
			else if (comp < 0) {
				System.out.println("The first word is smaller.");
			}
			else {
				System.out.println("The last word is smaller.");
				newStr = w2+' '+w1;
			}
			System.out.printf("New string: %s", newStr);
		}
		
		input.close();
	}
}
