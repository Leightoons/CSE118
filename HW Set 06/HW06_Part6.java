import java.util.Scanner;
public class HW06_Part6 {
	
	private static boolean IsPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while(j > i) {
			if (str.charAt(j) != str.charAt(i))
				return false;
			++i;
			--j;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input a (preferably 5-character) string: ");
		String str = input.nextLine();

		boolean isPalindrome = IsPalindrome(str);
		if (isPalindrome)
			System.out.println("The string '"+str+"' is a palindrome.");
		else
			System.out.println("The string '"+str+"' is NOT a palindrome.");
		
		input.close();
	}
}