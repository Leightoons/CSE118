import java.util.Scanner;

public class Midterm_Q6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String userStr = input.nextLine();
		int len = userStr.length();
		
		// get middle character
		char midChar = userStr.charAt(len/2);
		System.out.printf("Middle character '%c' = %d\n", midChar, (int)midChar);
		
		// get last char
		char lastChar = userStr.charAt(len-1);
		System.out.printf("Last character '%c' = %d\n", lastChar, (int)lastChar);
		
		if ((lastChar >= 'a' && lastChar <= 'z')||(lastChar >= 'A' && lastChar <= 'Z'))
			System.out.printf("Character '%c' is a letter character.\n", lastChar);
		else if (lastChar >= '0' && lastChar <= '9')
			System.out.printf("Character '%c' is a digital character.\n", lastChar);
		else
			System.out.printf("Character '%c' is not an alphanumeric character.\n", lastChar);
		
		// extract words
		String tStr = userStr.trim();
		
		int idx = tStr.indexOf(' ');
		if (idx < 0) idx = tStr.length()-1;
		String w1 = tStr.substring(0,idx);
		System.out.println("First word: "+w1);
		
		idx = tStr.lastIndexOf(' ');
		if (idx < 0) idx = 0;
		String w2 = tStr.substring(idx+1, tStr.length());
		System.out.println("Last word: "+w2);

		// compare words
		String newStr = w2 + w1;
		int comp = w1.compareTo(w1);
		if (comp > 0) newStr = w1+w2;
		
		// find word n palindrome
		int wLen = w1.length();
		if (wLen == 4) {
			boolean pal = true;
			if (w1.charAt(0) != w1.charAt(3)) pal = false;
			else if (w1.charAt(1) != w1.charAt(2)) pal = false;
			
			System.out.printf("%s %s a palindrome.",w1, pal? "is":"is not");
		}
			
	}

}
